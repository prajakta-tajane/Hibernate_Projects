package com.hibenateproj.studentproj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity(name="Laptop_table")
public class LaptopDetails 
{
	@Id

	@Column(name="USER_ID")
	private int uid;
	
	@Column(name="User_NAME")
	private String uname;
	
	@Column(name="LAPTOP_NAME")
	private String lname;
	
	@Column(name="LAPTOP_VERSION")
	private int lversion;

//	@OneToOne
	@OneToOne(mappedBy="laptop")
	@JoinColumn(name = "EMAIL_ID")
	private StudentDetails student;

	
	//Generate Getters & Setters
	public int getUid() 
	{
		return uid;
	}

	public void setUid(int uid) 
	{
		this.uid = uid;
	}

	public String getUname() 
	{
		return uname;
	}

	public void setUname(String uname) 
	{
		this.uname = uname;
	}

	public String getLname() 
	{
		return lname;
	}

	public void setLname(String lname) 
	{
		this.lname = lname;
	}

	public int getLversion() 
	{
		return lversion;
	}

	public void setLversion(int lversion) 
	{
		this.lversion = lversion;
	}

	public StudentDetails getStudent() 
	{
		return student;
	}

	public void setStudent(StudentDetails student) 
	{
		this.student = student;
	}

	//Generate Constructor using Fields
	public LaptopDetails(int uid, String uname, String lname, int lversion, StudentDetails student) 
	{
		super();
		this.uid = uid;
		this.uname = uname;
		this.lname = lname;
		this.lversion = lversion;
		this.student = student;
	}

	//Generate Constructors from Superclass
	public LaptopDetails() 
	{
		super();
	}
}
