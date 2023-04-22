package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entities.Car;
import org.example.entities.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Person p = new Person();
        p.setName("Person 1");

        Car c1 = new Car();
        c1.setBrandName("Brand 1");

        Car c2 = new Car();
        c2.setBrandName("Brand 2");

        c1.setPerson(p);
        c2.setPerson(p);

        p.setCars(List.of(c1,c2));

        entityManager.persist(p);
        entityManager.persist(c1);
        entityManager.persist(c2);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
