package org.example.Inheritence.SingleTable;

import jakarta.persistence.Entity;

@Entity
public class Dog extends Animal{

    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
