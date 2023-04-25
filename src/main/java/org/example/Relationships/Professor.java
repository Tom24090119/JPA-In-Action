package org.example.Relationships;

import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany
    @JoinTable(name = "prof_stud",
            joinColumns = @JoinColumn(name = "prof"),
            inverseJoinColumns = @JoinColumn(name = "stud")
    )
    @MapKeyColumn(name = "course")
    private Map<String, Student> studentsCourses = new HashMap<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Map<String, Student> getStudentsCourses() {
        return studentsCourses;
    }
}
