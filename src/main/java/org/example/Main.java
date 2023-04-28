package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();

            //Put your work with entity here

            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            entityManager.getTransaction().rollback();
            //log the error here
        }
        finally {
            entityManager.close();
        }


    }
}
