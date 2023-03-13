package com.durgasoft.test;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.durgasoft.pojo.Employee;

public class Test
{
	public static void main(String[] args)
	{
		// creating Configuration Object
		Configuration config = new Configuration();

		// to encapsulate all data from configuration file to config object
		config.configure();

		// to load drivers and establish connection
		SessionFactory sessionFactory = config.buildSessionFactory();

		// like preparing Statement object
		Session session = sessionFactory.openSession();

		// CREATING tx object in 2 Steps
		Transaction tx = session.getTransaction();
		tx.begin();

		// creating pojo class object and setting values for insert
		Employee employee = new Employee();
		employee.setEno(12);
		employee.setEname("Ajfan");
		employee.setEsal(7000f);
		employee.setEaddr("MLP");

		boolean isSuccessfull = false;

		// Inserting the Object to DB using persist method
		// if we use persist() method then it will insert a record in DB
		// and it will not return primary key value.
		// this method throws Exceptions , if failed to insert
		try
		{
			session.persist(employee);
			tx.commit(); // commit also throw Exceptions
			isSuccessfull = true;
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			
			System.err.println(e.getCause());// print ORA code wuth Exception name
		}
		// checking success or failed
		if (isSuccessfull)
		{
			System.out.println("record inserted Successfully");
		} else
		{
			System.out.println("oops....Someting went wrong..failed to insert record..");
		}
	}
}