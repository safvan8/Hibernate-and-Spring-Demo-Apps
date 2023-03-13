package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.MobileCustomer;

public class VersioningDemo
{
	public static void main(String[] args)
	{
		// CREATING Configuration Object
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");

		// creating SessionFactory
		SessionFactory sessionFactory = config.buildSessionFactory();

		// creating session
		Session session = sessionFactory.openSession();

		// starting transaction
		Transaction tx = session.beginTransaction();

		// getting existing record with customer id 1
		MobileCustomer customer = session.get(MobileCustomer.class, 1);

		if (customer != null)
		{
			// chainging customer mobile number, so version count will increase
			// automatically
			customer.setCallerTune("ya thoyba...");
			customer.setMobNo("00943431212");
		}

		try
		{
			tx.commit();
			System.out.println("Object updated successfully ");
			System.out.println("Version count is : " + customer.getVesionCount());
		} catch (HibernateException e)
		{

			tx.rollback();
			System.out.println("Object updating Failed..... ");
			System.out.println("Version count is : " + customer.getVesionCount());

		}

	}
}
