package com.capgemini.java.advanced_framework_hibernate_one_to_one.mini_project.entity;
import jakarta.persistence.*;
@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private College college;

}