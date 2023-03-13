package in.ineuron.main;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Employee;

public class Test
{
	public static void main(String[] args) throws IOException
	{
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		// getting records of safvan
		Employee employee =  session.get(Employee.class, 14);

		if (employee != null)
		{
			System.out.println("Before modification : " + employee);

			// pausing Execution until pressing Enter : meanwhile go and make changes in
			// Database record
			System.in.read();

	
			// refreshing to get latest changes
			session.refresh(employee);

			System.out.println("After modification : " + employee);
		} else
		{
			System.out.println(" Record not found..");
		}
		
		session.close();
		sessionFactory.close();

	}
}
