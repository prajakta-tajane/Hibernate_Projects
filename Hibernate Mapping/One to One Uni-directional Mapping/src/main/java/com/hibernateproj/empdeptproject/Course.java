package com.hibernateproj.empdeptproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity(name="course_table")

public class Course 
{
@Id

@Column(name="Course_Id")
private int cid;

@Column(name="Course_Name")
private String cname;

@OneToOne
@JoinColumn(name = "ID")
private Student student;


//Generate Getters & Setters

public int getCid() 
{
	return cid;
}

public void setCid(int cid) 
{
	this.cid = cid;
}

public String getCname() 
{
	return cname;
}

public void setCname(String cname) 
{
	this.cname = cname;
}

public Student getStudent() 
{
	return student;
}

public void setStudent(Student student) 
{
	this.student = student;
}

//Generate Constructor using Fields
public Course(int cid, String cname, Student student) 
{
	super();
	this.cid = cid;
	this.cname = cname;
	this.student = student;
}

//Generate Constructors from Superclass
public Course() 
{
	super();
}
}
