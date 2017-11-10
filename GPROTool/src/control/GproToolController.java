/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.ConnectionHandler;
import view.Login;

/**
 *
 * @author Rafael
 */
public class GproToolController {
    
    public GproToolController(){
        
    }
    
    public void start(){
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
    }
    
    public boolean autUsuario(String email, String pass) throws Exception {
        
        ConnectionHandler.setEmail(email);
        ConnectionHandler.setPassword(pass);
        
        ConnectionHandler handler = ConnectionHandler.getHandler();
        
        return false;
    }
    
}
