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

        Person person1 = new Person();
        person1.setName("Person 1");

        Address address1 = new Address();
        address1.setStrNumber(1234);
        address1.setStrName("SomeWhere Here");
        address1.setCity("Some City");

        person1.setAddress(address1);

        entityManager.persist(person1);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
