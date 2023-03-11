package com.hibernateproj.empdeptproject;


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
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	// is the session factory closed ?
//    	System.out.println(factory.isClosed());
    	
    	Session session = factory.openSession();
    	// Begin the transaction
    	Transaction t = session.beginTransaction();
    	
    	
    	// Create the Student
    	Student s = new Student();
    	s.setId(103);
    	s.setName("Indra");
    	
    	// Create the Course
    	Course c1 = new Course();
    	c1.setCid(2003);
    	c1.setCname("ML");
    	s.setCourse(c1);
    	c1.setStudent(s);
    	
    	
    	
    	session.save(s);
    	session.save(c1);
    	t.commit();
    	session.close();
    	factory.close();
    	
    }
}


// One To One Relationship Uni-Directional