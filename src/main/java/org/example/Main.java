package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entities.Car;
import org.example.entities.Person;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        //What if we want to know all the cars that a person has
        //i.e how to make a bidirectional relationship


        Person p = new Person();
        p.setName("Person 1");

        Car c1 = new Car();
        c1.setBrandName("Brand 1");

        Car c2 = new Car();
        c2.setBrandName("Brand 2");

        c1.setPerson(p);
        c2.setPerson(p);

        entityManager.persist(p);
        entityManager.persist(c1);
        entityManager.persist(c2);

        entityManager.getTransaction().commit();
        entityManager.close();


    }
}
