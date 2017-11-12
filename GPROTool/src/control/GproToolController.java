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
import model.ConnectionHandler;
import model.DAO;
import model.Race;
import model.RaceSDAO;
import view.Login;

/**
 *
 * @author Rafael
 */
public class GproToolController {
    
    public GproToolController(){
        
    }
    
    public void start(){
        Login loginScreen = new Login(this);
        loginScreen.setVisible(true);
    }
    
    public boolean autUsuario(String email, String pass) throws LoginException {
        
        ConnectionHandler.setEmail(email);
        ConnectionHandler.setPassword(pass);
        
        ConnectionHandler handler = ConnectionHandler.getHandler();
        
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
    
}
