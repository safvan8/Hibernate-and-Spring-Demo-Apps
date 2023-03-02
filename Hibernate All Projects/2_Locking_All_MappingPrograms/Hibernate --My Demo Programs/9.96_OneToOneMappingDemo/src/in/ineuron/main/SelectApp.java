package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Employee;

public class SelectApp
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		try
		{
			Employee employee = session.get(Employee.class, 1);

			employee.display();

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
