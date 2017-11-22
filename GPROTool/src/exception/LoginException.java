/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Rafael
 */
public class LoginException extends Exception {
    
    public LoginException(){
        
    }
    
    public LoginException(String message){
        super(message);
    }
    
    public LoginException(Throwable cause){
        super(cause);
    }
    
    public LoginException(String message, Throwable cause){
        super(message, cause);
    }
    
}
