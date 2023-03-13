package in.ineuron.main;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.model.InsurancePolicy;

public class LockingAppTest2
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = null;

		boolean flag = false;

		try
		{

			transaction = session.beginTransaction();

			InsurancePolicy policy = session.get(InsurancePolicy.class, 1L, LockMode.UPGRADE_NOWAIT);
			System.out.println(policy);

			System.out.println("Application2 retririved first record for update at same time");

			// modify some data with policy object
			System.out.println("Directly modifying --Application2 Thread");
			policy.setTenure(24);

			flag = true;

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			if (flag)
			{
				transaction.commit();
				System.out.println("Object updated..by Application 2.");
			} else
			{
				transaction.rollback();
				System.out.println("Object not updated..in  Application 2.");
			}
		}

	}

}
