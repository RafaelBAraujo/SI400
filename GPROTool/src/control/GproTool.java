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

        /*RaceQuery rq = new RaceQuery();
            
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
