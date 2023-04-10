package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("User 1");
        userInfo.setHappy(true);
        userInfo.setStatus(Status.SINGLE);

        UserInfo userInfo2 = new UserInfo();
        userInfo2.setUserName("User 2");
        userInfo2.setHappy(false);
        userInfo2.setStatus(Status.MARRIED);

        entityManager.persist(userInfo);

        entityManager.getTransaction().commit();

        UserInfo info = entityManager.find(UserInfo.class,1);
        System.out.println(info);

        entityManager.close();
    }
}
