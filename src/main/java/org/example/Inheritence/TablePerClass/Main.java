package org.example.Inheritence.TablePerClass;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        Person p = new Person();
        p.setGender(Gender.FEMALE);
        p.setId(1);
        p.setName("Person 1");

        Student s = new Student();
        s.setId(2);
        s.setGender(Gender.MALE);
        s.setName("Student 1");
        s.setSchoolName("UoM");

        entityManager.persist(s);
        entityManager.persist(p);

        entityManager.getTransaction().commit();

        entityManager.close();

    }
}
