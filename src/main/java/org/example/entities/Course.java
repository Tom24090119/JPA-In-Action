package org.example.entities;

import jakarta.persistence.*;

import java.util.List;

/**
 * CREATE TABLE `JPA-In-Action`.`course` (
 *   `id` INT NOT NULL AUTO_INCREMENT,
 *   `name` VARCHAR(45) NULL,
 *   `professor_name` VARCHAR(45) NULL,
 *   PRIMARY KEY (`id`));
 */
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "professor_name")
    private String professorName;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

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

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
