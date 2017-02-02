package com.yegor.car;

import java.io.Serializable;

/**
 * This class represents Car object.
 * Created by YegorKost on 01.02.2017.
 */
public class Car implements Serializable {
    private static final long serialVersionUID = 1234567L;

    private Engine engine;
    private int year = 2017;
    private String brand;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }
}
