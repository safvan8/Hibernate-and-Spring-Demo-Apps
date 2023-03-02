package in.ineuron.main;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.model.InsurancePolicy;
import in.ineuron.util.HibernateUtil;

public class LockingAppTest1
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

			// locking record -- No other threads will be able to access same record 
			InsurancePolicy policy = session.get(InsurancePolicy.class, 1L, LockMode.UPGRADE_NOWAIT);
			
			System.out.println("Application one retririved first record for update");

			for (int i = 0; i < 10; i++)
			{
//				System.out.println("Appplication1 - Thread is sleeping " + i);
				Thread.sleep(1000);
			}
			// modify some data with policy object :setting tenure to 12
			policy.setTenure(12);
			flag = true;

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			if (flag)
			{
				transaction.commit();
				System.out.println("Object updated.by Application 1..");
			} else
			{
				transaction.rollback();
				System.out.println("Object not updated... in  Application 1..");
			}
		}

	}

}
