package com.capgemini.java.advanced_framework_hibernate_one_to_one.mini_project.dao;


import com.capgemini.java.advanced_framework_hibernate_one_to_one.mini_project.entity.University;

import jakarta.persistence.*;

public class UniversityDAO {

    EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("university");

    EntityManager em = emf.createEntityManager();

    public void addUniversity(University u) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(u);

        tx.commit();

        System.out.println("University saved successfully");
    }
}