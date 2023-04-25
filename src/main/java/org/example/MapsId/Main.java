package org.example.MapsId;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Department department1 = new Department();
        department1.setName("Department 1");

        Employee e1 = new Employee();
        e1.setName("EMP 1");
        e1.setDepartment(department1);

        department1.getEmployees().put(0,e1);

        Employee e2 = new Employee();
        e2.setName("EMP 2");
        e2.setDepartment(department1);

        department1.getEmployees().put(1,e2);

        entityManager.persist(e1);
        entityManager.persist(e2);
        entityManager.persist(department1);

        entityManager.getTransaction().commit();

        Department d = entityManager.find(Department.class,1);
        System.out.println(d.getEmployees());
        entityManager.close();
    }
}
