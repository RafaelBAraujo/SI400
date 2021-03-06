package model;

import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import exception.LoginException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

class SilentHtmlUnitDriver extends HtmlUnitDriver {

    SilentHtmlUnitDriver() {
        super();
        this.getWebClient().setCssErrorHandler(new SilentCssErrorHandler());
    }
}

public class ConnectionHandler {

    private static ConnectionHandler handler = null;
    public static SilentHtmlUnitDriver driver = null;
    private static WebElement user;
    private static WebElement passw;
    private static String email;
    private static String password;
    private boolean offline = false;

    public ConnectionHandler() throws LoginException{

        if(!offline){
            driver = new SilentHtmlUnitDriver();
            driver.get("https://www.gpro.net/gb/gpro.asp");
            user = driver.findElement(By.name("textLogin")); // gotten by attribute "name" in html
            user.sendKeys(email);
            passw = driver.findElement(By.name("textPassword")); // gotten by attribute "name" in html
            passw.sendKeys(password);
            //System.out.println("Logging in...");
            passw.submit();
            if(driver.getCurrentUrl().matches(".+Login\\.asp\\?Redirect=gpro\\.asp")){
                System.out.println(driver.getCurrentUrl());
                throw new LoginException("Invalid credentials! Please try again.");
            }   
        }

    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }

    public static ConnectionHandler getHandler() throws LoginException {
        if (handler == null) {
                handler = new ConnectionHandler();
            return handler;
        } else {
            return handler;
        }

    }

    public static void setEmail(String email) {
        ConnectionHandler.email = email;
    }

    public static void setPassword(String password) {
        ConnectionHandler.password = password;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public boolean checkURL(String url) {

        if (driver.getCurrentUrl() == url) {
            return true;
        } else {
            return false;
        }

    }

    public void openHome() {
        if (!this.checkURL("gpro.net/gb/gpro.asp")) {
            this.getDriver().findElement(By.xpath("//a[@href='/gb/gpro.asp']")).click();
        }
    }

    public void openRaceAnalisys() {
        if (this.checkURL("gpro.net/gb/gpro.asp")) {
            this.getDriver().findElement(By.xpath("//a[@href='RaceAnalysis.asp']")).click();
        } else {
            this.getDriver().findElement(By.xpath("//a[@href='/gb/gpro.asp']")).click();
            this.getDriver().findElement(By.xpath("//a[@href='RaceAnalysis.asp']")).click();
        }
    }

    public void openTrackList() {
        if (this.checkURL("gpro.net/gb/gpro.asp")) {
            this.getDriver().findElement(By.xpath("//a[@href='ViewTracks.asp']")).click();
        } else {
            this.getDriver().findElement(By.xpath("//a[@href='/gb/gpro.asp']")).click();
            this.getDriver().findElement(By.xpath("//a[@href='ViewTracks.asp']")).click();
        }
    }
    
    public void openTesting() {
        
        if (this.checkURL("gpro.net/gb/gpro.asp")) {
            this.getDriver().findElement(By.xpath("//a[@href='Testing.asp']")).click();
        } else {
            this.getDriver().findElement(By.xpath("//a[@href='/gb/gpro.asp']")).click();
            this.getDriver().findElement(By.xpath("//a[@href='Testing.asp']")).click();
        }
    }

}