/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.LoginException;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import view.Login;

/**
 *
 * @author Rafael
 */
public class GproTool {

    public static void main(String args[]) {

        /*DAO dao = RaceAnalysisSDAO.getInstance();
=======
        
        
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
        
        RaceQuery rq = new RaceQuery();
        
        try{
            TreeMap<Integer, RaceAnalysis> result = (TreeMap<Integer, RaceAnalysis>) dao.search(rq);
            System.out.println("Size: "+result.size());
            for(Map.Entry<Integer, RaceAnalysis> entry : result.entrySet()){
                System.out.println("Key: "+entry.getKey());
                System.out.println(entry.getValue().getRace().getTrack().getTrackName());
                System.out.println(entry.getValue().getRace().getManagerUsername());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        
        GproToolController baseController = new GproToolController();
        baseController.start();
        
    }

}
