package in.ineuron.main;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Branch;
import in.ineuron.pojo.Student;

public class InsertApp
{
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration();
		configuration.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = null;

		boolean flag = false;
		try
		{
			transaction = session.beginTransaction();
			
			// creating Dependent object
			Branch branch = new Branch("CS687876", "TVM");

			// creating Multiple Targets Object and injecting dependent Object
			Student s1 = new Student(12, "Safvan", 21, branch);
			Student s2 = new Student(13, "nsisl", 31, branch);
			Student s3 = new Student(14, "rashi", 24, branch);

			// saving objects
			Serializable id1 = session.save(s1);
			Serializable id2 = session.save(s2);
			Serializable id3 = session.save(s3);

			flag = true;

		} catch (HibernateException he)
		{
			he.printStackTrace();
		} finally
		{
			if (flag)
			{
				transaction.commit();
				System.out.println("object saved ");
			} else
			{
				transaction.commit();
				System.out.println("Object saving failed");
			}
		}

	}
}
