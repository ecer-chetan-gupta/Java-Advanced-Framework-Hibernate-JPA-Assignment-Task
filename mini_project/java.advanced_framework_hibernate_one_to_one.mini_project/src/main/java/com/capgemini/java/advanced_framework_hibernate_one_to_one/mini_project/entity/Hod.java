package com.capgemini.java.advanced_framework_hibernate_one_to_one.mini_project.entity;
import jakarta.persistence.*;
@Entity
public class Hod {

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@OneToOne(cascade = CascadeType.ALL)
    private Teacher teacher;

}