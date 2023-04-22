package org.example.entities;

import jakarta.persistence.*;

/**
 * CREATE TABLE `JPA-In-Action`.`Car` (
 *   `id` INT NOT NULL AUTO_INCREMENT,
 *   `BrandName` VARCHAR(45) NULL,
 *   `person_id` INT NULL,
 *   PRIMARY KEY (`id`));
 */

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String brandName;

    @ManyToOne
    private Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
