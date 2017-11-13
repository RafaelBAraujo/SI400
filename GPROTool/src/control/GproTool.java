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
import model.*;
import view.Login;

/**
 *
 * @author Rafael
 */
public class GproTool {
    
    public static void main(String args[]) throws LoginException{

        
        
        //Manager m = s.readManager();

        /*System.out.println("Reading race...");
        t.setRace(s.readRace());
        System.out.println("Reading forecast...");
        t.getRace().setRaceForecast(s.readForecast());
        */
        //String str = s.readTesting().getTestingWeather().getWeather();
        /*try {
            //dao.add(m);
            //Manager readManager = (Manager) dao.get("Rafael Araújo");
            t = (Testing) dao.get(addingTesting);
            if(t != null){
                System.out.println(stints[1].getMean());

            }
        } catch (Exception ex) {
            Logger.getLogger(GproTool.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        
        /*Testing t = s.readTesting();
        TestingStint[] stints = t.getStints();
        System.out.println(stints[1].getTyres());
        */        
        
        //Manager m = s.readManager();
        /*RaceAnalysis ra = new RaceAnalysis();
        System.out.println("Reading race...");
        ra.setRace(s.readRace());
        System.out.println("Reading forecast...");
        ra.getRace().setRaceForecast(s.readForecast());
        System.out.println("Reading car...");
        ra.setCar(s.readCar());
        System.out.println("Reading pilot...");
        ra.setPilot(s.readPilot());
        System.out.println("Reading pitstops...");
        ra.setPitstop(s.readPitStops());
        System.out.println("Reading practice...");
        ra.setPractice(s.readPractice());
        System.out.println("Reading wear...");
        ra.setRaceWear(s.readRaceWear());
        System.out.println("Reading strategy...");
        ra.setStrategy(s.readStrategy());
        System.out.println("Reading qualifyings...");
        ra.setQualifyings(s.readQualifying());
        System.out.println("Reading qualifyings's weather...");
        ra.getQualifyings().getQ1().setWeather(s.readQ1Weather());
        ra.getQualifyings().getQ2().setWeather(s.readQ2Weather());*/
        
        /*try {
            dao.add(m);
            Manager readManager = (Manager) dao.get("Rafael Araújo");
        //ConnectionHandler handler = new ConnectionHandler();
        //Scraper s = new Scraper();
        //Manager m = s.readManager();
        
        //Qualifyings qfs = new Qualifyings();
        //qfs = s.readQualifying();
        
        //qfs.getQ1().setWeather(s.readQ1Weather());
        //qfs.getQ2().setWeather(s.readQ2Weather());
        
        
        HashSet addingRaceAnalysis = new HashSet();
        addingRaceAnalysis.add(61);
        addingRaceAnalysis.add("Amateur");
        addingRaceAnalysis.add(87);
        addingRaceAnalysis.add(13);
        addingRaceAnalysis.add("barbaroto96@gmail.com");
        addingRaceAnalysis.add("Sunny");
        addingRaceAnalysis.add(36);
        addingRaceAnalysis.add(6);
        
        System.out.println("tamanho é::" + addingRaceAnalysis.size());
        
        /*
            Temp: 39°C
            Humidity: 38%
        */
        
        //DAO dao = RaceAnalysisSDAO.getInstance();
        
        try{
            //dao.add(ra);
        } catch (Exception ex) {
            Logger.getLogger(GproTool.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*
        try {
            //dao.add(ra);
            ra = (RaceAnalysis) dao.get(addingRaceAnalysis);
            if(ra != null){
                System.out.println(ra.getRace().getMoneyEarned());

            }
            else{
                System.out.println("nao encontrei o marcelo");
            }
            Manager readManager = (Manager) dao.get("Rafael Araújo");
            if(readManager != null){
                System.out.println(readManager.getUsername());
            }
            else{
                System.out.println("nao encontrei o marcelo");
            } */
            
            //Race r = s.readRace();
            //Car myCar = s.readCar();
            //System.out.println(myCar.getManagerName());
            
            //DAO dao = CarSDAO.getInstance();
            //DAO dao = TrackSDAO.getInstance();
            /*DAO dao = RaceSDAO.getInstance();
            HashSet hs = new HashSet();
            hs.add(61);
            hs.add("Rookie");
            hs.add(59);
        } catch (Exception ex) {
            Logger.getLogger(GproTool.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        //Login loginScreen = new Login();
        //loginScreen.setVisible(true);

        GproToolController baseController = new GproToolController();
        baseController.start();

        
    }
    
}
