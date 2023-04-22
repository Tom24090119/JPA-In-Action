package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entities.Course;
import org.example.entities.Student;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Student s = new Student();
        s.setName("Student 1");
        s.setJoinedAt(LocalDateTime.now());

        Course c1 = new Course();
        c1.setName("Course 1");
        c1.setProfessorName("Professor 1");

        c1.setStudents(List.of(s));
        s.setCourses(List.of(c1));

        entityManager.persist(c1);
        entityManager.persist(s);

        entityManager.getTransaction().commit();

        entityManager.close();


    }
}
