package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entity.User;

public class Main
{
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        User user = new User();
        user.setName("User 1");
        user.setTech(Tech.JAVA);

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
