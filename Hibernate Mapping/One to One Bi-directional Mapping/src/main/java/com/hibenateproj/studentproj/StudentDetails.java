package com.hibenateproj.studentproj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity(name="Student_table")
public class StudentDetails 
{
	// @Id - Specifies that the given field is the primary key of the entity
	@Id

	// @Column – This simply maps a given field to a column inside the database.

	@Column(name="ID")
	private int id;

	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL_ID")
	private String Email;

//	@OneToOne(mappedBy="student")
	@OneToOne
	@JoinColumn(name = "LAPTOP_NAME")
	private LaptopDetails laptop;

	
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

	public String getEmail() 
	{
		return Email;
	}

	public void setEmail(String email) 
	{
		Email = email;
	}

	public LaptopDetails getLaptop() 
	{
		return laptop;
	}

	public void setLaptop(LaptopDetails laptop) 
	{
		this.laptop = laptop;
	}

	//Generate Constructor using Fields
	public StudentDetails(int id, String name, String email, LaptopDetails laptop) 
	{
		super();
		this.id = id;
		this.name = name;
		Email = email;
		this.laptop = laptop;
	}

	//Generate Constructors from Superclass
	public StudentDetails() 
	{
		super();
	}
}
