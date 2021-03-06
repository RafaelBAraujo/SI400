/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.LoginException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import model.ConnectionHandler;
import model.DAO;
import model.Lap;
import model.Pilot;
import model.Pit;
import model.Practice;
import model.PracticeLap;
import model.Race;
import model.RaceAnalysis;
import model.RaceAnalysisSDAO;
import model.RaceQuery;
import model.RaceSDAO;
import model.Scraper;
import model.Testing;
import model.TestingQuery;
import model.TestingSDAO;
import model.TestingStint;
import model.Track;
import model.TrackSDAO;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import view.Login;
import view.SearchTestingScreen;

/**
 *
 * @author Rafael
 */
public class GproToolController {
    
    private ConnectionHandler handler;
    private RaceAnalysis race;

    public RaceAnalysis getRace() {
        return race;
    }

    public void setRace(RaceAnalysis race) {
        this.race = race;
    }

    public GproToolController(){
        
    }
    
    public void start(){
        Login loginScreen = new Login(this);
        loginScreen.setVisible(true);
    }
    
    public XYDataset getPilotDataset(TreeMap<Integer, RaceAnalysis> races) {

        DefaultXYDataset ds = new DefaultXYDataset();
        double[][] pilotOverall = {{}, {}};
        int x = 0, y = 0;
        
        //double[][]
        
        Stack<Integer> s = new Stack<>();
        
        for(Map.Entry<Integer, RaceAnalysis> entry : races.entrySet()){
            s.add(Integer.parseInt(entry.getValue().getPilot().getNewPts()[0]));
        }
        
        for (int r = 0; r < pilotOverall.length; r++) {
            for (int c = 0; c < pilotOverall[r].length; c++) {
                pilotOverall[r][c] = s.pop();//your value
            }
        }
        
        
        
        double[][] data = {{0.1, 0.2, 0.3},
                            {1,   2,   3}};
        
        //ds.addSeries("series1", data);
        ds.addSeries("Pilot Overall", pilotOverall);

        return ds;
    }
    
    public boolean autUsuario(String email, String pass) throws LoginException {
        
        ConnectionHandler.setEmail(email);
        ConnectionHandler.setPassword(pass);
        
        ConnectionHandler c = ConnectionHandler.getHandler();
        this.handler = c;
        
        return true;
    }
    
    public boolean searchRace(Integer season, String rank, Integer rankDivision){
        
        DAO dao = RaceSDAO.getInstance();
        HashSet searchingRace = new HashSet();
        searchingRace.add(season);
        searchingRace.add(rank);
        searchingRace.add(rankDivision);
        
        try {
            Race foundRace = (Race) dao.get(searchingRace);
            if(foundRace != null)
                return true;
        } catch (Exception ex) {
            Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    public boolean searchTesting(Integer season, String rank, Integer rankDivision){
        
        DAO dao = TestingSDAO.getInstance();
        HashSet searchingTesting = new HashSet();
        searchingTesting.add(season);
        searchingTesting.add(rank);
        searchingTesting.add(rankDivision);
        
        try {
            Testing foundTesting = (Testing) dao.get(searchingTesting);
            if(foundTesting != null)
                return true;
        } catch (Exception ex) {
            Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public boolean readTesting(javax.swing.JProgressBar bar, javax.swing.JTextPane txp, JFrame window){
    
        Scraper scraper = new Scraper();
        Testing test = new Testing();
        bar.setStringPainted(true);
        Document doc = txp.getDocument();
        
        try{
            
            bar.setValue(10);
            doc.insertString(doc.getLength(), "Reading testing...\n", null);
            test = scraper.readTesting(this.handler);
            bar.setValue(50);
            //Aguarda 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
            }
            bar.setValue(90);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
            }
            bar.setValue(100);
        
        } catch (BadLocationException ex) {
            Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DAO TestingDAO = TestingSDAO.getInstance();
        
        try{
            txp.setText("");
            doc.insertString(doc.getLength(), "Saving to file...\n", null);
            TestingDAO.add(test);
            window.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Failed to read testing.");
            System.out.println(ex.getMessage());
            window.dispose();
            //Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public TreeMap<Integer, RaceAnalysis> searchRace(RaceQuery query){
        
        DAO dao = RaceAnalysisSDAO.getInstance();
        TreeMap<Integer, RaceAnalysis> result = (TreeMap<Integer, RaceAnalysis>) dao.search(query);

        return result;
    }
    
    public boolean searchRace(RaceQuery query, DefaultTableModel model){
        
        DAO dao = RaceAnalysisSDAO.getInstance();
        TreeMap<Integer, RaceAnalysis> result = (TreeMap<Integer, RaceAnalysis>) dao.search(query);
        
        model.setRowCount(0); // clears table
        
        if(result.size() > 0){
            for(Map.Entry<Integer, RaceAnalysis> entry : result.entrySet()){
                model.addRow(new Object[]{entry.getKey(), "S" + entry.getValue().getRace().getSeason() + " " + entry.getValue().getRace().getRank() + 
                        entry.getValue().getRace().getRankDivision()});
            }
            return true;
        }
        
        return false;
    }
    
    public RaceAnalysis searchRace(Integer key){
        
        DAO dao = RaceAnalysisSDAO.getInstance();
        
        RaceAnalysis race = null;
        try {
            race = (RaceAnalysis) dao.get(key);
        } catch (Exception ex) {
            Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return race;        
    }
    
    public void displayRace(Integer key, DefaultTableModel modelPractice, DefaultTableModel modelLaps, DefaultTableModel modelPistops,
                            DefaultTableModel modelCar, DefaultTableModel modelCarCarac, DefaultTableModel modelInitialWear,
                            DefaultTableModel modelFinalWear, DefaultTableModel modelQualifyings, DefaultTableModel modelQSetups,
                            DefaultTableModel modelForecast, DefaultTableModel modelRisks, DefaultTableModel modelStartingRisk){
        
        RaceAnalysis race = this.searchRace(key);

        Practice p = race.getPractice();
        
        for(Integer lap = 0; lap < 8; lap++){
            try{
                PracticeLap l = p.getLap(lap);
                Integer lapNumb = lap + 1;
                modelPractice.addRow(new Object[] {String.valueOf(lapNumb), l.getLapTime(), l.getDriverMistake(), l.getNetTime(), l.getfWing(),
                                                    l.getrWing(), l.getEngine(), l.getBrakes(), l.getGear(), l.getSusp(), l.getTyres()});
            }
            catch(NullPointerException ex){
                break;
            }
        }
        
        race.getRace().getLaps().forEach((lap) -> {
            modelLaps.addRow(new Object[] {lap.lapNumber, lap.lapTime, lap.pos, lap.tyre, lap.weather, lap.temp, lap.Hum, lap.events});
        });
        
        
        
        for(Pit pit : race.getPitstop().getP()){
            modelPistops.addRow(new Object[]{pit.getPitLap(), pit.getPitReason(), pit.getTyresCond(), pit.getFuelLeft(), pit.getRefill(),
                                pit.getPitTime()});
        }
        
        modelCar.addRow(new Object[]{race.getCar().getCha(), race.getCar().getEng(), race.getCar().getfWing(), race.getCar().getrWing(),
            race.getCar().getUnderb(), race.getCar().getCool(), race.getCar().getGear(), race.getCar().getBra(), race.getCar().getSusp(),
            race.getCar().getElec()});
        
        
        modelInitialWear.addRow(new Object[]{race.getRaceWear().getStartWear().getCha(), race.getRaceWear().getStartWear().getEng(), race.getRaceWear().getStartWear().getfWing(), race.getRaceWear().getStartWear().getrWing(),
            race.getRaceWear().getStartWear().getUnderb(), race.getRaceWear().getStartWear().getCool(), race.getRaceWear().getStartWear().getGear(), race.getRaceWear().getStartWear().getBra(), race.getRaceWear().getStartWear().getSusp(),
            race.getRaceWear().getStartWear().getElec()});
        
        modelFinalWear.addRow(new Object[]{race.getRaceWear().getFinalWear().getCha(), race.getRaceWear().getFinalWear().getEng(), race.getRaceWear().getFinalWear().getfWing(), race.getRaceWear().getFinalWear().getrWing(),
            race.getRaceWear().getFinalWear().getUnderb(), race.getRaceWear().getFinalWear().getCool(), race.getRaceWear().getFinalWear().getGear(), race.getRaceWear().getFinalWear().getBra(), race.getRaceWear().getFinalWear().getSusp(),
            race.getRaceWear().getFinalWear().getElec()});
        
        modelCarCarac.addRow(new Object[]{race.getCar().getPower(), race.getCar().getHandling(), race.getCar().getAcceleration()});
        
        modelQualifyings.addRow(new Object[]{race.getQualifyings().getQ1().getLapTime(), race.getQualifyings().getQ2().getLapTime()});
        modelQSetups.addRow(new Object[]{"Q1",race.getQualifyings().getQ1().getSetup().getFWing(), race.getQualifyings().getQ1().getSetup().getRWing(),
                            race.getQualifyings().getQ1().getSetup().getEng(), race.getQualifyings().getQ1().getSetup().getBra(),
                            race.getQualifyings().getQ1().getSetup().getGear(), race.getQualifyings().getQ1().getSetup().getSusp(),
                            race.getQualifyings().getQ1().getSetup().getTyres()});
        
        modelQSetups.addRow(new Object[]{"Q2",race.getQualifyings().getQ2().getSetup().getFWing(), race.getQualifyings().getQ2().getSetup().getRWing(),
                            race.getQualifyings().getQ2().getSetup().getEng(), race.getQualifyings().getQ2().getSetup().getBra(),
                            race.getQualifyings().getQ2().getSetup().getGear(), race.getQualifyings().getQ2().getSetup().getSusp(),
                            race.getQualifyings().getQ2().getSetup().getTyres()});
        
        modelQSetups.addRow(new Object[]{"Race", race.getStrategy().getRaceSetup().getFWing(), race.getStrategy().getRaceSetup().getRWing(),
                            race.getStrategy().getRaceSetup().getEng(), race.getStrategy().getRaceSetup().getBra(),
                            race.getStrategy().getRaceSetup().getGear(), race.getStrategy().getRaceSetup().getSusp(),
                            race.getStrategy().getRaceSetup().getTyres()});

 
        
        modelForecast.addRow(new Object[]{"Start - 0h30m", race.getRace().getRaceForecast().getRainProb(0)});
        modelForecast.addRow(new Object[]{"0h30m - 1h", race.getRace().getRaceForecast().getRainProb(1)});
        modelForecast.addRow(new Object[]{"1h - 1h30m", race.getRace().getRaceForecast().getRainProb(2)});
        modelForecast.addRow(new Object[]{"1h30m - 2h", race.getRace().getRaceForecast().getRainProb(3)});
        
        
        modelRisks.addRow(new Object[]{race.getStrategy().getOvertake(), race.getStrategy().getDefend(),
                                       race.getStrategy().getCtDry(), race.getStrategy().getCtWet(),
                                       race.getStrategy().getMalfunc()});
        
        modelStartingRisk.addRow(new Object[]{race.getStrategy().getStartingRisk()});
       
        
    }
    
    public ArrayList<String> getTrackList(){
        
        DAO dao = TrackSDAO.getInstance();
        ArrayList<String> trackNames = new ArrayList<>();
        
        for(int i = 1; i < Scraper.readTrackListSize(handler)+1; i++){
            try {
                Track t = (Track) dao.get(i);
                trackNames.add(t.getTrackName());
            } catch (Exception ex) {
                Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return trackNames;
    }
    public void resultTesting(DefaultTableModel model){
        
        TestingStint t = new TestingStint();
        DAO dao = TestingSDAO.getInstance();
        SearchTestingScreen sts = new SearchTestingScreen(this);
        
        try {
            model.addRow(new Object []{dao.get(t.getLapsDone()), dao.get(t.getBestlap())});
            // TreeMap<Integer, Testing> result = (TreeMap<Integer, Testing>) dao.search(query);
        } catch (Exception ex) {
            Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public Testing searchTesting(Integer TestingKey){
        
        DAO dao = TestingSDAO.getInstance();
        try {
            Testing t = (Testing) dao.get(TestingKey);
            return t;
        } catch (Exception ex) {
            Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void displayTesting(Integer key, DefaultTableModel modelResults){
        
        Testing testing = this.searchTesting(key);
        
        for(TestingStint stint : testing.getStints()){
            //System.out.println(stint.getLapSetup().getSusp());
            try{
            modelResults.addRow(new Object[]{stint.getLapsDone(), stint.getLapsDone(), stint.getBestlap(), stint.getMean(), stint.getLapSetup().getFWing(), 
                stint.getLapSetup().getRWing(), stint.getLapSetup().getEng(), stint.getLapSetup().getBra(), stint.getLapSetup().getGear(),
                stint.getLapSetup().getSusp(), stint.getTyres(), stint.getFuel(), stint.getTyresCond(), stint.getFuelLeft()});
            }
            catch(NullPointerException e){
                break;
            }
        
        }
        
    }
    
    public boolean searchTesting(TestingQuery query, DefaultTableModel model){
        
        DAO dao = TestingSDAO.getInstance();
        TreeMap<Integer, Testing> result = (TreeMap<Integer, Testing>) dao.search(query);
        
        System.out.println("SearchTesting result size: " + result.size());
        
        model.setRowCount(0); // clears table
        
        if(result.size() > 0){
            for(Map.Entry<Integer, Testing> entry : result.entrySet()){
                model.addRow(new Object[]{entry.getKey(), "S" + entry.getValue().getSeason() + " " + entry.getValue().getRank() + 
                        entry.getValue().getRankDivision()});
            }
            return true;
        }
        
        return false;
    }
    
    public boolean readRaceAnalysis(javax.swing.JProgressBar bar, javax.swing.JTextPane txp, JFrame window){
        
        Scraper scraper = new Scraper();
        RaceAnalysis race = new RaceAnalysis();
        bar.setStringPainted(true);
        Document doc = txp.getDocument();
        
        try {
            bar.setValue(10);
            doc.insertString(doc.getLength(), "Reading race...\n", null);
            race.setRace(scraper.readRace(this.handler));
            race.getRace().setRaceForecast(scraper.readForecast(handler));
            
            bar.setValue(20);
            race.setRaceWear(scraper.readRaceWear(this.handler));
            
            bar.setValue(30);
            doc.insertString(doc.getLength(), "Reading strategy...\n", null);
            race.setStrategy(scraper.readStrategy(this.handler));
            
            bar.setValue(40);
            doc.insertString(doc.getLength(), "Reading car...\n", null);
            race.setCar(scraper.readCar(this.handler));
            
            bar.setValue(50);
            doc.insertString(doc.getLength(), "Reading qualifyings...\n", null);
            race.setQualifyings(scraper.readQualifying(this.handler));
            bar.setValue(60);
            race.getQualifyings().getQ1().setWeather(scraper.readQ1Weather(this.handler));
            bar.setValue(65);
            race.getQualifyings().getQ2().setWeather(scraper.readQ2Weather(this.handler));
            
            bar.setValue(70);
            doc.insertString(doc.getLength(), "Reading pilot...\n", null);
            race.setPilot(scraper.readPilot(this.handler));
            
            bar.setValue(80);
            doc.insertString(doc.getLength(), "Reading pitstops...\n", null);
            race.setPitstop(scraper.readPitStops(this.handler));
            
            bar.setValue(90);
            doc.insertString(doc.getLength(), "Reading practice...\n", null);
            race.setPractice(scraper.readPractice(this.handler));
            bar.setValue(100);
            
        } catch (BadLocationException ex) {
            Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
            DAO raceAnalysisDAO = RaceAnalysisSDAO.getInstance();
            txp.setText("");
            doc.insertString(doc.getLength(), "Saving to file...\n", null);
            raceAnalysisDAO.add(race);
            window.dispose();
        } catch(org.openqa.selenium.TimeoutException ex) {
            JOptionPane.showMessageDialog(null, "The connection with GPRO was lost.");
        } catch (Exception ex) {  
            JOptionPane.showMessageDialog(null, "Failed to read race analysis.");
            window.dispose();
        }
        
        return false;
    }
           
}
