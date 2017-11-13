/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.LoginException;
import java.util.HashSet;
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

        GproToolController baseController = new GproToolController();
        baseController.start();
        
    }

}
