package com.hibernateproject.ManytoManyProjectandEmployeeRelationship;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//Reading the hibernate configuration file
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        // Create the SessionFactory object
        SessionFactory factory=cfg.buildSessionFactory();
        
        
        // Create the Session object
        Session session= factory.openSession();
        
        
        // Start the transaction of the session object
        Transaction tx=session.beginTransaction();
        
        
        // Create the Employee entity object
        Employee e1 =new Employee();
        // Set the value to the Employee entity
        e1.setEid(101);
        e1.setEname("Shiv");
        e1.setDepartment("Devloper");
        
        
        Employee e2=new Employee();
        e2.setEid(102);
        e2.setEname("Rudra");
        e2.setDepartment("Devloper");
        
        
        
        // Create the Project entity object
        Project p1=new Project();
        // Set the value to the Project entity
        p1.setPid(201);
        p1.setPname("JAVA");
         
        Project p2=new Project();
        p2.setPid(202);
        p2.setPname("Angular");
        
        
        Project p3=new Project();
        p3.setPid(203);
        p3.setPname("Python");
        
        
        // Creating the list of Project to associate with many employee
        List<Project> proj=new ArrayList<Project>();
        // Add Project to the list of the Project
        proj.add(p1);
        proj.add(p2);
        proj.add(p3);
        
        
        // Creating the list of Employee to associate with many Project
        List<Employee> Emp=new ArrayList<Employee>(); 
        // Add Employee to the list of the Employee
        Emp.add(e1);
        Emp.add(e2);
        
        
        // Setting the Employee for Project object
        p1.setEmployee(Emp);
        
        // Setting the Project for Employee object
        e1.setProject(proj);
               
        
        // Save the Employee to the database
        session.save(e1);
        session.save(e2);
        
        // Save the Project to the database
        session.save(p1);
        session.save(p2);
        session.save(p3);
        
        
        //Close the transaction
        tx.commit();
        
        // Close the Session
        session.close();
        
        // Close the factory
        factory.close();
        
        
    }
}
