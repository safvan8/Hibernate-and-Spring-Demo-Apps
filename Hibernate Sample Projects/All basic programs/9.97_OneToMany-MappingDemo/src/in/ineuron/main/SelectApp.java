package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Department;

public class SelectApp
{
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration();
		configuration.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Department department = session.get(Department.class, 78909);

		// to see contents od Dept object
		department.display();

	}
}
