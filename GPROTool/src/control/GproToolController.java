/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.LoginException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import model.ConnectionHandler;
import model.DAO;
import model.Race;
import model.RaceAnalysis;
import model.RaceAnalysisSDAO;
import model.RaceSDAO;
import model.Scraper;
import model.Track;
import model.TrackSDAO;
import view.Login;

/**
 *
 * @author Rafael
 */
public class GproToolController {
    
    private ConnectionHandler handler;
    
    public GproToolController(){
        
    }
    
    public void start(){
        Login loginScreen = new Login(this);
        loginScreen.setVisible(true);
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
            JOptionPane.showMessageDialog(null, "Failed to read race analysis.");
            //Logger.getLogger(GproToolController.class.getName()).log(Level.SEVERE, null, ex);
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
        
            System.out.println(race.getRace().getTrack().getTrackName());
            
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
