package com.hibernateproj.empdeptproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity(name="Student_table")

public class Student 
{
@Id

@Column(name="ID")
private int id;

@Column(name="NAME")
private String name;

@OneToOne(mappedBy="student")
private Course course;


//Generate Getters & Setters
public int getId() 
{
	return id;
}

public void setId(int id) 
{
	this.id = id;
}

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public Course getCourse() 
{
	return course;
}

public void setCourse(Course course) 
{
	this.course = course;
}

//Generate Constructor using Fields
public Student(int id, String name, Course course) 
{
	super();
	this.id = id;
	this.name = name;
	this.course = course;
}


//Generate Constructors from Superclass
public Student() 
{
	super();
	// TODO Auto-generated constructor stub
}

}
