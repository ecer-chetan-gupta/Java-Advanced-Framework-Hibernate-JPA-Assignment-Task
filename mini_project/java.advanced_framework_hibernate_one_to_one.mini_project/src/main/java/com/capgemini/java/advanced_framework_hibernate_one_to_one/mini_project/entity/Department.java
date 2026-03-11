package com.capgemini.java.advanced_framework_hibernate_one_to_one.mini_project.entity;
import jakarta.persistence.*;
@Entity
public class Department {

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

	public Hod getHod() {
		return hod;
	}

	public void setHod(Hod hod) {
		this.hod = hod;
	}

	@OneToOne(cascade = CascadeType.ALL)
    private Hod hod;

}