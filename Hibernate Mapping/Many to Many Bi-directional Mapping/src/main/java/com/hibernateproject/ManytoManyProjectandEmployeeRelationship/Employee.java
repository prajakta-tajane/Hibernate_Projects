package com.hibernateproject.ManytoManyProjectandEmployeeRelationship;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Employee_Table")

public class Employee 
{

	@Id
	private int eid;
	private String ename;
	private String Department;
	
	@ManyToMany 
	@JoinTable(name="Employee_Project_Table",joinColumns= {@JoinColumn(name="eid")},inverseJoinColumns= {@JoinColumn(name="pid")})
	
	
	private List<Project>project;

	
	// Generates Getters and Setters
	public int getEid() 
	{
		return eid;
	}

	public void setEid(int eid) 
	{
		this.eid = eid;
	}

	public String getEname() 
	{
		return ename;
	}

	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	public String getDepartment() 
	{
		return Department;
	}

	public void setDepartment(String department) 
	{
		Department = department;
	}

	public List<Project> getProject() 
	{
		return project;
	}

	public void setProject(List<Project> project) 
	{
		this.project = project;
	}

	
	// Generates Constructor using Fields
	public Employee(int eid, String ename, String department, List<Project> project) 
	{
		super();
		this.eid = eid;
		this.ename = ename;
		Department = department;
		this.project = project;
	}

	
	// Generates Constructors from Super class.
	public Employee() 
	{
		super();
	}
}
