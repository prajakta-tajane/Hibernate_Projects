package com.hibernateproject.ManytoManyProjectandEmployeeRelationship;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="Project_Table")
public class Project 
{
	@Id
	private int pid;
	private String pname;
	
	@ManyToMany (mappedBy="project")
	
	private List<Employee>employee;

	
	// Generates Getters and Setters
	public int getPid() 
	{
		return pid;
	}

	public void setPid(int pid) 
	{
		this.pid = pid;
	}

	public String getPname() 
	{
		return pname;
	}

	public void setPname(String pname) 
	{
		this.pname = pname;
	}

	public List<Employee> getEmployee() 
	{
		return employee;
	}

	public void setEmployee(List<Employee> employee) 
	{
		this.employee = employee;
	}
	
	
	// Generates Constructor using Fields
	public Project(int pid, String pname, List<Employee> employee) 
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.employee = employee;
	}
	

	// Generate Constructors from Super class.
	public Project() 
	{
		super();
	}
	
	

}
