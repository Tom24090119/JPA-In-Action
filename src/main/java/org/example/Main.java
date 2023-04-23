package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Person p = new Person();
        p.setName("Person 1");
        p.getPhoneNumbers().put(PhoneType.HOME,"1234");
        p.getPhoneNumbers().put(PhoneType.OFFICE,"5678");

        entityManager.persist(p);

        entityManager.getTransaction().commit();
        entityManager.close();


    }
}
