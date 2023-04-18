package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entities.Department;
import org.example.entities.Employee;

import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        /*
         *
         * CREATE TABLE `depart_emp` (
         *   `employees_id` int DEFAULT NULL,
         *   `department_id` int DEFAULT NULL
         * );
         */

        // What exception  do you get when you don't create or have a bridge Table

        // What if the bridge Table has different column names.
        // In that case what should be done.
        //Refer to ManyToOne bidirectional relation.

        entityManager.getTransaction().begin();

        Employee e1 = new Employee();
        e1.setName("Employee 1");
        e1.setJoinedAt(LocalDate.now());

        Employee e2 = new Employee();
        e2.setName("Employee 2");
        e2.setJoinedAt(LocalDate.now());

        Department d1 = new Department();
        d1.setName("Science");
        d1.setEmployees(Arrays.asList(e1,e2));

        entityManager.persist(e1);
        entityManager.persist(e2);
        entityManager.persist(d1);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
