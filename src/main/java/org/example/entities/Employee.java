package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * CREATE TABLE `JPA-In-Action`.`employee` (
 *   `id` INT NOT NULL AUTO_INCREMENT,
 *   `name` VARCHAR(45) NULL,
 *   `joinedAt` DATETIME NULL,
 *   PRIMARY KEY (`id`));
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private LocalDate joinedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(LocalDate joinedAt) {
        this.joinedAt = joinedAt;
    }
}
