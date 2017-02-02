package com.yegor.car;

import java.io.*;

/**
 * This class contains method for serialization and deserialization Car object.
 * Created by YegorKost on 01.02.2017.
 */
public class CarSerialization {

    /**
     * Method serializes object to file.
     * @param file destination file for object that is serialised
     * @param car object for serialization
     * @return file where object has been serialized
     */
    public File serializeCar(File file, Car car) {
        try (BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(file));
             ObjectOutput output = new ObjectOutputStream(bout)){
            output.writeObject(car);
            System.out.println("Object is serialized");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return file;
    }

    /**
     * Method deserializes object from file.
     * @param file source file for object that is deserialised
     * @return Car object that is deserialized
     */
    public Car deserialize(File file) {
        Car car = null;
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file));
             ObjectInput input = new ObjectInputStream(bin)){
            car = (Car) input.readObject();
            System.out.println("Object is deserialized");
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return car;
    }

    public static void main(String[] args) {
        Car audi = new Car("Audi", new Engine("Diesel"));
        CarSerialization carSerialization = new CarSerialization();

        File file = new File("test.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File is created - " + file.exists());
                carSerialization.serializeCar(file, audi);
                if (file.exists()) {
                    System.out.println(carSerialization.deserialize(file));
                }
            } else {
                System.out.println("File is not created - " + file.exists());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (file.exists()){
                System.out.println("File is deleted - " + file.delete());
            }
        }

    }
}
