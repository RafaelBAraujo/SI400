/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class CarSDAO extends SDAO<Car> {

    public static CarSDAO instance;
    public final String fileName = "cars.ser";

    /**
     * HashSet (Race, Manager)
     */
    private TreeMap<Integer, Car> cars;

    public CarSDAO() {
        this.cars = new TreeMap<>();
        this.getAll();
    }

    public static CarSDAO getInstance() {
        if (CarSDAO.instance == null) {
            CarSDAO.instance = new CarSDAO();
        }
        return CarSDAO.instance;
    }

    public void getAll() {
        try {
            FileInputStream fileIn = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TreeMap<Integer, Car> carsFile;
            carsFile = (TreeMap<Integer, Car>) in.readObject();
            this.cars = carsFile;
            fileIn.close();
            in.close();
        } catch (EOFException | FileNotFoundException | ClassNotFoundException ex) {
            File f = new File(this.fileName);
            try {
                boolean createNewFile = f.createNewFile();
                if (createNewFile) {
                }
            } catch (IOException ex1) {
                Logger.getLogger(CarSDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(CarSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Car get(Object o) throws Exception {

        if (o instanceof HashSet) {
            for (Map.Entry<Integer, Car> entry : this.cars.entrySet()) {
                HashSet currentCar = new HashSet();
                currentCar.add(entry.getValue().getSeason());
                currentCar.add(entry.getValue().getRank());
                currentCar.add(entry.getValue().getRankDivision());
                currentCar.add(entry.getValue().getManagerName());
                HashSet querySet;
                querySet = (HashSet) o;
                if (currentCar.equals(querySet)) {
                    return entry.getValue();
                }
            }
        }

        return null;
    }

    @Override
    public void delete(Car b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Car b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Car b) throws Exception {
        System.out.println(b.getSeason());
        System.out.println(b.getRank());
        System.out.println(b.getRankDivision());
        System.out.println(b.getManagerName());
        if (!this.cars.isEmpty()) {
            HashSet newCarKey = new HashSet();
            newCarKey.add(b.getSeason());
            newCarKey.add(b.getRank());
            newCarKey.add(b.getRankDivision());
            newCarKey.add(b.getManagerName());
            for (Map.Entry<Integer, Car> entry : this.cars.entrySet()) {
                HashSet currentCarKey = new HashSet();
                currentCarKey.add(entry.getValue().getSeason());
                currentCarKey.add(entry.getValue().getRank());
                currentCarKey.add(entry.getValue().getRankDivision());
                currentCarKey.add(entry.getValue().getManagerName());
                if (currentCarKey.equals(newCarKey)) {
                    return;
                }
            }
            Integer lastKey = this.cars.lastKey();
            this.cars.put(lastKey + 1, b);

            try {
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.cars);
                fileOut.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(CarSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        this.cars.put(1, b);
        try {
            FileOutputStream fileOut = new FileOutputStream(this.fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.cars);
            fileOut.close();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(CarSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Object search(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
