package in.ineuron.main;

import org.hibernate.query.Query;
import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateError;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import in.ineuron.pojo.Employee;

public class SelectAll
{
	public static void main(String[] args)
	{
		// creating Configuration Object
		Configuration config = new Configuration();

		// to encapsulate all data from configuration file to config object
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");

		// to load drivers and establish connection
		SessionFactory sessionFactory = config.buildSessionFactory();

		// like preparing Statement object
		org.hibernate.Session session = sessionFactory.openSession();

		// using getResultList()
		try
		{
			Query<Employee> query = session.createQuery("FROM in.ineuron.pojo.Employee WHERE eno = :empNo");

			int id = 1;
			// setting named parameter
			query.setParameter("empNo", id);

			/*
			 * to get unique rows only based on primary key Employee employee =
			 * query.uniqueResult();
			 * 
			 * if (employee != null) System.out.println(employee); else
			 * System.out.println("Record Not found for the id ::" + id);
			 */

			// this will check null automatically , no need to do it manually
			Optional<Employee> optional = query.uniqueResultOptional();

			if (optional.isPresent())
			{
				Employee employee = optional.get();
				System.out.println(employee);
			} else
				System.out.println("Record not found for the given id::" + id);

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			sessionFactory.close();
		}
	}
}
