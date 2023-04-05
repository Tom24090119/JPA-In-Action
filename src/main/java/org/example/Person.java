package org.example;

import jakarta.persistence.*;

/**
 *
 * CREATE TABLE `JPA-In-Action`.`person` (
 *   `id` INT NOT NULL AUTO_INCREMENT,
 *   `name` VARCHAR(45) NULL,
 *   `street_number` VARCHAR(45) NULL,
 *   `street_name` VARCHAR(45) NULL,
 *   `city` VARCHAR(45) NULL,
 *   PRIMARY KEY (`id`));
 *
 */

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Embedded
    @AttributeOverride(name = "strNumber",column = @Column(name = "street_number"))
    @AttributeOverride(name = "strName",column = @Column(name = "street_name"))
    private Address address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
