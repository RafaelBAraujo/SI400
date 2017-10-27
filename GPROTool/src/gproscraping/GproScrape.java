package gproscraping;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.http.impl.io.SocketOutputBuffer;

public class GproScrape {

    public static void main(String[] args) throws ClassNotFoundException {

        ConnectionHandler handler = new ConnectionHandler();
        Scraper scraper = new Scraper();
        //scraper.readStrategy();
        
        Practice practice = new Practice();
        Race race = new Race();
        Car car = new Car();
        Pilot pilot = new Pilot();
        Qualifyings qualifyings = new Qualifyings();
        RaceWear raceWear = new RaceWear();
        PitStop pitstop = new PitStop();
        
        System.out.println("Iniciando scraping...");

        long iTime = System.nanoTime();
        
        /*System.out.println("Practice...");
        practice = scraper.readPractice();*/
        /*System.out.println("Wear...");
        raceWear = scraper.readRaceWear();
        System.out.println("Qualifying...");
        qualifyings = scraper.readQualifying();
        qualifyings.getQ1().setWeather(scraper.readQ1Weather());
        qualifyings.getQ2().setWeather(scraper.readQ2Weather());
        System.out.println("Race...");
        race = scraper.readRace();
        race.setRaceForecast(scraper.readForecast());
        System.out.println("Pilot...");
        pilot = scraper.readPilot();
        System.out.println("Car...");
        car = scraper.readCar();
        System.out.println("Pitstops...");
        pitstop = scraper.readPitStops();*/

        /*SerializingDAO dao = new PracticeDAO("practice.ser");
        dao.save(practice)*/
        /*
        pilot = scraper.readPilot();
        System.out.println(pilot.getTal());
        */
        
        //PilotDAO P = new PilotDAO("pilot.ser");
        
        //P.retrievePilot(pilot);
        
        CarDAO C = new CarDAO("car.ser");
        
        C.retrieveCar(car, raceWear);

        long fTime = System.nanoTime();
        
        System.out.println("Pronto!");
        System.out.println("Tempo de execu��o: " + TimeUnit.MILLISECONDS.convert((fTime - iTime), TimeUnit.MILLISECONDS) + " milisegundos.");
        
       //Tracks t = new Tracks();
        //t.checkUpdate();
        
        //Race r = new Race();
        //r = scraper.readRace();
        //r.setTrack(t.getTrack("Zolder"));
        
        //Cerealizador c = new Cerealizador("piloto.ser");
        //c.writeObject(p);
        //c.readObject();

        handler.getDriver().quit();

    }

}
