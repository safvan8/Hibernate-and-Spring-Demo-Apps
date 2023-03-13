package com.durgasoft.test;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.durgasoft.pojo.Employee;

public class Test
{
	public static void main(String[] args)
	{
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try
		{
			// creating Configuration Object
			config = new Configuration();

			// to encapsulate all data from configuration file to config object
			config.configure();

			// to load drivers and establish connection
			sessionFactory = config.buildSessionFactory();

			// like preparing Statement object
			session = sessionFactory.openSession();

			// getting transaction and starting -> setAutocommit(flase) internally
			tx = session.getTransaction();
			tx.begin();

			// creating pojo class Object for updating
			Employee employee = new Employee();
			employee.setEno(567);
		
			// updating using 
			session.delete(employee);

			// committing
			tx.commit();
			System.out.println("No way to identify record Updated or not ");

		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			System.out.println("Record update failed........");
		} 
		finally
		{
			session.close();
			sessionFactory.close();
		}

	}
}
