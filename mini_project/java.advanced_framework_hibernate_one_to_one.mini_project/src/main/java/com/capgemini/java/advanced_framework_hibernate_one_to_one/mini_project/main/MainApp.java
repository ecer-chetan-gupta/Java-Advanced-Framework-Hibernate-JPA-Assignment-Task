package com.capgemini.java.advanced_framework_hibernate_one_to_one.mini_project.main;

import java.util.Scanner;

import com.capgemini.java.advanced_framework_hibernate_one_to_one.mini_project.dao.UniversityDAO;
import com.capgemini.java.advanced_framework_hibernate_one_to_one.mini_project.entity.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Project Title:");
        String projectTitle = sc.nextLine();

        System.out.println("Enter Student Name:");
        String studentName = sc.nextLine();

        System.out.println("Enter Teacher Name:");
        String teacherName = sc.nextLine();

        System.out.println("Enter HOD Name:");
        String hodName = sc.nextLine();

        System.out.println("Enter Department Name:");
        String deptName = sc.nextLine();

        System.out.println("Enter College Name:");
        String collegeName = sc.nextLine();

        System.out.println("Enter University Name:");
        String universityName = sc.nextLine();


        Project p = new Project();
        p.setTitle(projectTitle);

        Student s = new Student();
        s.setName(studentName);
        s.setProject(p);

        Teacher t = new Teacher();
        t.setName(teacherName);
        t.setStudent(s);

        Hod h = new Hod();
        h.setName(hodName);
        h.setTeacher(t);

        Department d = new Department();
        d.setName(deptName);
        d.setHod(h);

        College c = new College();
        c.setName(collegeName);
        c.setDepartment(d);

        University u = new University();
        u.setName(universityName);
        u.setCollege(c);

        UniversityDAO dao = new UniversityDAO();
        dao.addUniversity(u);

        System.out.println("University data saved successfully");

        sc.close();
    }
}