package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * CREATE TABLE `JPA-In-Action`.`person` (
 *   `id` INT NOT NULL AUTO_INCREMENT,
 *   `name` VARCHAR(45) NULL,
 *   PRIMARY KEY (`id`));
 */

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
