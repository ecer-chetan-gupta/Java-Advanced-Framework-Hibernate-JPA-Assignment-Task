package com.capgemini.java.advanced_framework_hibernate_one_to_one.mini_project.entity;
import jakarta.persistence.*;
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@OneToOne(cascade = CascadeType.ALL)
    private Student student;

    // getters setters
}