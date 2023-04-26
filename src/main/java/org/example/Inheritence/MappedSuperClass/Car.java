package org.example.Inheritence.MappedSuperClass;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Car extends Vehicle{
    @Enumerated(value = EnumType.STRING)
    @Column(name = "car_type")
    private CarType carType;

    public CarType getType() {
        return carType;
    }

    public void setType(CarType carType) {
        this.carType = carType;
    }
}

