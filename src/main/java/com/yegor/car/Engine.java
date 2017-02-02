package com.yegor.car;

import java.io.Serializable;

/**
 * This class represents Engine object.
 * Created by YegorKost on 01.02.2017.
 */
class Engine implements Serializable {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                '}';
    }
}
