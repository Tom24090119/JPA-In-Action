package org.example.Inheritence.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity
public class Bike extends Vehicle {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
