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
		// creating Configuration Object
		Configuration config = new Configuration();

		// to encapsulate all data from customized configuration file name to config
		// object
		config.configure("MyConfig.xml");

		// to load drivers and establish connection -
		SessionFactory sessionFactory = config.buildSessionFactory();

		// like preparing Statement object
		Session session = sessionFactory.openSession();

		// getting transaction and starting -> setAutocommit(flase) internally
		Transaction tx = session.beginTransaction();

		// creating pojo class Object for Deleting
		Employee employee = new Employee();
		employee.setEno(888);

		// flag
		boolean isDeleted = false;

		// delete () return type is void
//		try
//		{
//			// deleting record safvan using delete()
			session.delete(employee);

			tx.commit();
			isDeleted = true;

//		} catch (HibernateException e)
//		{
//			e.printStackTrace();
//		}

		if (isDeleted)
			System.out.println("record deleted Successfully");
		else
			System.out.println("Record Deletion failed");

	}
}
