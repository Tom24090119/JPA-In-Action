package org.example.Inheritence.MappedSuperClass;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        Car c1 = new Car();
        c1.setName("Car 1");
        c1.setType(CarType.DIESEL);

        Bike b1 = new Bike();
        b1.setName("Bike 1");
        b1.setColor("Red");

        entityManager.persist(c1);
        entityManager.persist(b1);

        entityManager.getTransaction().commit();

        entityManager.close();


    }

}
