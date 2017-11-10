/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproscraping;

/**
 *
 * @author Marcelo
 */
public class CarDAO extends SerializingDAO{
    
    public CarDAO(String fileName) {
        super(fileName);
    }
    
    Scraper src = new Scraper();
    SerializingDAO ser = new SerializingDAO("car.ser") {};
    
    /*public void retrieveCar(Car c, RaceWear r) throws ClassNotFoundException{
    
        c = src.readCar();
        System.out.println("Power:");
        ser.save(c.getPower());
        ser.retrieve(c.getPower());
        System.out.println("");
        
        System.out.println("Handling:");
        ser.save(c.getHandling());
        ser.retrieve(c.getHandling());
        System.out.println("");
        
        System.out.println("Acceleration:");
        ser.save(c.getAcceleration());
        ser.retrieve(c.getAcceleration());
        System.out.println("");
        
        r = src.readRaceWear();
        System.out.println("Chassis:");
        System.out.printf("Lvl: ");
        ser.save(c.getCha());
        ser.retrieve(c.getCha());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getCha());
        ser.retrieve(r.getFinalWear().getCha());
        System.out.println("\n");
        
        System.out.println("Engine:");
        System.out.printf("Lvl: ");
        ser.save(c.getEng());
        ser.retrieve(c.getEng());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getEng());
        ser.retrieve(r.getFinalWear().getEng());
        System.out.println("\n");
        
        System.out.println("Front Wing:");
        System.out.printf("Lvl: ");
        ser.save(c.getfWing());
        ser.retrieve(c.getfWing());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getfWing());
        ser.retrieve(r.getFinalWear().getfWing());
        System.out.println("\n");
        
        System.out.println("Rear Wing:");
        System.out.printf("Lvl: ");
        ser.save(c.getrWing());
        ser.retrieve(c.getrWing());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getrWing());
        ser.retrieve(r.getFinalWear().getrWing());
        System.out.println("\n");
        
        System.out.println("Underbody:");
        System.out.printf("Lvl: ");
        ser.save(c.getUnderb());
        ser.retrieve(c.getUnderb());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getUnderb());
        ser.retrieve(r.getFinalWear().getUnderb());
        System.out.println("\n");
        
        System.out.println("Sideposts:");
        System.out.printf("Lvl: ");
        ser.save(c.getSidep());
        ser.retrieve(c.getSidep());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getSidep());
        ser.retrieve(r.getFinalWear().getSidep());
        System.out.println("\n");
        
        System.out.println("Cooling:");
        System.out.printf("Lvl: ");
        ser.save(c.getCool());
        ser.retrieve(c.getCool());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getCool());
        ser.retrieve(r.getFinalWear().getCool());
        System.out.println("\n");
        
        System.out.println("Gearbox:");
        System.out.printf("Lvl: ");
        ser.save(c.getGear());
        ser.retrieve(c.getGear());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getGear());
        ser.retrieve(r.getFinalWear().getGear());;
        System.out.println("\n");
        
        System.out.println("Brakes:");
        System.out.printf("Lvl: ");
        ser.save(c.getBra());
        ser.retrieve(c.getBra());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getBra());
        ser.retrieve(r.getFinalWear().getBra());
        System.out.println("\n");
        
        System.out.println("Suspension:");
        System.out.printf("Lvl: ");
        ser.save(c.getSusp());
        ser.retrieve(c.getSusp());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getSusp());
        ser.retrieve(r.getFinalWear().getSusp());
        System.out.println("\n");
        
        System.out.println("Electronics:");
        System.out.printf("Lvl: ");
        ser.save(c.getElec());
        ser.retrieve(c.getElec());
        System.out.printf("Wear: ");
        ser.save(r.getFinalWear().getElec());
        ser.retrieve(r.getFinalWear().getElec());
        System.out.println("\n");
        
        System.out.println("...\n");

    }*/
}
