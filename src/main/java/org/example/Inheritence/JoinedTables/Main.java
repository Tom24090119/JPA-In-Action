package org.example.Inheritence.JoinedTables;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        Product p = new Product();
        p.setName("Product 1");

        Chocolate c = new Chocolate();
        c.setName("Chocolate 1");
        c.setKcal(100);

        entityManager.persist(p);
        entityManager.persist(c);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
