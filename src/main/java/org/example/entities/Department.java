package org.example.entities;

import jakarta.persistence.*;

import java.util.List;


/**
 * CREATE TABLE `JPA-In-Action`.`department` (
 *   `id` INT NOT NULL AUTO_INCREMENT,
 *   `name` VARCHAR(45) NULL,
 *   PRIMARY KEY (`id`));
 */
@Entity
public class Department {

    // If you have different column names you can use @Column Annotations

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany
    @JoinTable(name = "depart_emp",joinColumns = @JoinColumn(name = "depart_id") , inverseJoinColumns = @JoinColumn(name = "emp_id"))
    private List<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
