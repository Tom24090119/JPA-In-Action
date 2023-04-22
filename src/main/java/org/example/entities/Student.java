package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * CREATE TABLE `JPA-In-Action`.`student` (
 *   `id` INT NOT NULL AUTO_INCREMENT,
 *   `joinedAt` DATETIME NULL,
 *   `name` VARCHAR(45) NULL,
 *   PRIMARY KEY (`id`));
 */
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private LocalDateTime joinedAt;

    // You can always add joinColumns and inverseJoinColumns if your column names in your bridge tables are different
    // By default JPA searches for columns name with 'courses_id' and 'students_id'
    // If you look carefully they start with the names of the List variable names in both the classes suffixed with '_id'
    // Since it is ManyToMany,it doesn't matter which entity is the owning side of the bridge table.
    // You can consider any side as an owning side for the bridge table
    // Hence only in ManyToMany relationships , it doesn't matter where you put mappedBy and JoinTable. Because you can
    // consider either side as an owning side.

    @ManyToMany
    @JoinTable(name = "stud_course")
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setJoinedAt(LocalDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }
}
