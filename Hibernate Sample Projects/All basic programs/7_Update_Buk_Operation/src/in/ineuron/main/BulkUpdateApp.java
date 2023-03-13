package in.ineuron.main;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.awt.HeadlessException;

import org.hibernate.Session;

public class BulkUpdateApp
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();

		boolean flag = false;
		int rowsUpdated = 0;

		try
		{
			// creating query
			Query<Integer> query = session
					.createQuery("DELETE FROM in.ineuron.pojo.Employee WHERE esal < :salaryAmmount");

			// setting parameter
			query.setParameter("salaryAmmount", 5000);
			// updating query
			rowsUpdated = query.executeUpdate();

			flag = true;

		} catch (HeadlessException e)
		{
			flag = false;
			e.printStackTrace();
		} finally
		{
			if (flag)
			{
				tx.commit();
				System.out.println("No of rows Updated : " + rowsUpdated);
			} else
			{
				tx.rollback();
				System.out.println("No records updated");
			}
		}

	}
}