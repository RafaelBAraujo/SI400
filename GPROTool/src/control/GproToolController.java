/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.Login;

/**
 *
 * @author Rafael
 */
public class GproToolController {
    
    GproToolController(){
        
    }
    
    public void start(){
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
    }
    
}
