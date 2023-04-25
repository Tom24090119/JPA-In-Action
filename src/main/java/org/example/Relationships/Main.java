package org.example.Relationships;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Student s1 = new Student();
        s1.setName("Student 1");

        Professor p1 = new Professor();
        p1.setName("Professor 1");
        p1.getStudentsCourses().put("Algebra",s1);
        p1.getStudentsCourses().put("Genetics",s1);

        entityManager.persist(s1);
        entityManager.persist(p1);

        entityManager.getTransaction().commit();

        Professor professor = entityManager.find(Professor.class,2);
        System.out.println(professor.getStudentsCourses());
        entityManager.close();
    }
}
