package com.hibenateproj.studentproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	System.out.println("Project is running");
    	
    	//Reading the hibernate configuration file
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	// Create the SessionFactory object
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	
    	// Create the Session object
    	Session session = factory.openSession();
    	
    	// Start the transaction of the session object
    	Transaction t = session.beginTransaction();
    	
    	
    	// Create the StudentDetails entity object
    	StudentDetails s = new StudentDetails();
    	// Set the value to the Student entity
    	s.setEmail("Narayani@gmai.com");
    	s.setId(103);
    	s.setName("Neera");
    	
    	// Create the LaptopDetails entity object
    	LaptopDetails l = new LaptopDetails();
    	// Set the value to the Laptop entity
    	l.setLname("LENOVA");
    	l.setLversion(20002);
    	l.setUid(203);
    	l.setUname("Nitu");
    	
    	// Setting the Laptop for student object
     	s.setLaptop(l);
     	// Setting the student for Laptop object
    	l.setStudent(s);
    	
    	// Save the StudentDetails to the database
    	session.save(s);
    	
    	// saving the LaptopDetails to the database
    	session.save(l);
    	
    	//Close the transaction
    	t.commit();
    	
    	// Close the Session
    	session.close();
    	
    	// Close the factory
    	factory.close();
    	
    }
}

// One TO One Relationship Bi-Directional
