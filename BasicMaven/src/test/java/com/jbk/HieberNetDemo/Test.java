package com.jbk.HieberNetDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg= new Configuration().configure();
		cfg.addAnnotatedClass(com.jbk.HieberNetDemo.Student.class);
		
	SessionFactory factory=	cfg.buildSessionFactory();
	Student s1= new Student("Radha","ME");
	Student s2= new Student("Ram","BE");
Session session=factory.openSession();
Transaction t=session.beginTransaction();
session.save(s1);
session.save(s2);
t.commit();
session.close();
System.out.println("hello hibernate");
	}

}
