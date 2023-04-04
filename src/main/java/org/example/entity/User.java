package org.example.entity;

import jakarta.persistence.*;
import org.example.Tech;

/**
 * CREATE TABLE `JPA-In-Action`.`user` (
 * `id` INT NOT NULL AUTO_INCREMENT,
 * `name` VARCHAR(50) NULL,
 * `tech` VARCHAR(45) NULL,
 * PRIMARY KEY (`id`));
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Enumerated(value = EnumType.STRING)
    private Tech tech;

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tech getTech() {
        return tech;
    }

    public void setTech(Tech tech) {
        this.tech = tech;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
