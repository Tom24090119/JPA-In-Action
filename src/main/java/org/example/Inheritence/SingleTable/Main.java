package org.example.Inheritence.SingleTable;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Inheritence.SingleTable.Animal;
import org.example.Inheritence.SingleTable.Dog;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        Animal animal = new Animal();
        animal.setName("Animal 1");

        Dog dog = new Dog();
        dog.setName("Dog 1");
        dog.setColor("Black");


        entityManager.persist(animal);
        entityManager.persist(dog);

        entityManager.getTransaction().commit();

        entityManager.close();


    }
}
