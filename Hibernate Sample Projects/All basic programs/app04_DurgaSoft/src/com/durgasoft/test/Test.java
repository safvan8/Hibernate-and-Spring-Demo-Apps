package com.durgasoft.test;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
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
		// Transaction tx = null; not required for SELECT

		try
		{
			// creating Configuration Object
			config = new Configuration();

			// to encapsulate all data from customized configuration file name to config
			// object
			config.configure("/com/durgasoft/resources/MyConfig.xml"); // location must strat with '/'

			// creating sessionFactory and opening session
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();

		
			// only calling load not accessing any value from returned object
			Employee emp = (Employee) session.load(Employee.class, 8888);
			
			System.out.println("=================================\n");
			System.out.println("Eno is: " + emp.getEno()); 
			
			System.out.println("eno printed-- before connecting to DB");
			
			System.out.println("EName is" + emp.getEname());
			System.out.println("Esal is :" + emp.getEsal());
			System.out.println("Eaddr is :" + emp.getEaddr());
			
		} catch (HibernateException  e)
		{
			e.printStackTrace();
		} finally
		{
			session.close();
			sessionFactory.close();
		}
	}
}
