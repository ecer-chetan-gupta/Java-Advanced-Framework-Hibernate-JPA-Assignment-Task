package com.capgemini.java_dev.framework_hibernate_jpa.main;

import java.util.Scanner;

import com.capgemini.java_dev.framework_hibernate_jpa.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JavaApp {

    public static void execution() {

        Scanner sc = new Scanner(System.in);

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("student");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter details for Employee " + i);

            Employee emp = new Employee();

            System.out.println("Enter Employee ID:");
            emp.setEmpId(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter Employee Name:");
            emp.setEmpName(sc.nextLine());

            System.out.println("Enter Email:");
            emp.setEmail(sc.nextLine());

            System.out.println("Enter Salary:");
            emp.setSalary(sc.nextDouble());
            sc.nextLine();

            em.persist(emp);
        }

        et.commit();

        System.out.println("Employees inserted successfully");

        sc.close();
    }
}