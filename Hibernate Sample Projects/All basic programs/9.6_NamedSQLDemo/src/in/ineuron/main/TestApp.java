package in.ineuron.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import in.ineuron.pojo.Student;

public class TestApp
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();

		int rowsUpdated = 0;
		int rowsDeleted = 0;
		boolean updateFlag = false;
		boolean deleteFlag = false;

		// Update
		try
		{
			transaction.begin();
			
			NativeQuery<Student> nativeQuery = session.getNamedNativeQuery("UPDATE_RECORDS");
			nativeQuery.setParameter("input_id", 1);
			rowsUpdated = nativeQuery.executeUpdate();

			updateFlag = true;
		} catch (HibernateException e)
		{
			e.printStackTrace();
		}

		// delete
		try
		{
			// checking transaction is active or not
			if (session.getTransaction().isActive())
			{
				NativeQuery<Student> nativeQuery = session.getNamedNativeQuery("DELETE_RECORDS");
				nativeQuery.setParameter("input_id", 4);
				rowsDeleted = nativeQuery.executeUpdate();

				deleteFlag = true;
			}
		} catch (HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (updateFlag == true && deleteFlag == true)
			{
				transaction.commit();
				System.out.println("Number of rows updated : " + rowsUpdated);
				System.out.println("Number of rows deleted : " + rowsDeleted);
			} else
			{
				transaction.rollback();
			}
		}

	}
}
