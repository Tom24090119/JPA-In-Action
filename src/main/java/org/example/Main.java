package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entities.Student;
import org.example.entities.StudentDetails;
import org.example.entities.TYPE;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        Student student = new Student();
        student.setName("Student 1");

        StudentDetails details = new StudentDetails();
        details.setType(TYPE.DOMESTIC);
        details.setStdNo(1234);
        details.setAccountCreated(LocalDateTime.now());

        student.setStudentDetails(details);

        entityManager.persist(details);
        entityManager.persist(student);

        entityManager.getTransaction().commit();
        entityManager.close();
    }


}
