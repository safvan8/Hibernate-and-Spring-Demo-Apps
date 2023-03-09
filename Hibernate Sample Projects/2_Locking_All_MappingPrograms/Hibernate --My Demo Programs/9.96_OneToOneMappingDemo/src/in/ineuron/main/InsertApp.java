package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Account;
import in.ineuron.pojo.Employee;

public class InsertApp
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = null;

		Transaction transaction = null;

		boolean flag = false;

		Integer empIdGenerated = 0;

		try
		{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			System.out.println(sessionFactory );
			System.out.println(session);
			
			
			// creating dependent object
			Account account1 = new Account("ICICI8799889", "savings", "safvan");

			// creating target and injecting
			// emp id is auro generated
			Employee e1 = new Employee("safvan", "java", account1);

			// saving
			empIdGenerated = (Integer) session.save(e1);
			System.out.println();
			flag = true;

		} catch (HibernateException he)
		{
			he.printStackTrace();
		} finally
		{
			if (flag)
			{
				transaction.commit();
				System.out.println("Employee record inserted with id : " + empIdGenerated);
			} else
			{
				transaction.rollback();
				System.out.println("EMployee insertion failed.");
			}
			session.close();
			sessionFactory.close();
		}
	}
}
