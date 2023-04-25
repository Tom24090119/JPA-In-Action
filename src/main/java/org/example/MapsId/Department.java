package org.example.MapsId;

import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "department")

    @MapKey(name = "id")
    private Map<Integer,Employee> employees = new HashMap<>();

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Employee> getEmployees() {
        return employees;
    }
}
