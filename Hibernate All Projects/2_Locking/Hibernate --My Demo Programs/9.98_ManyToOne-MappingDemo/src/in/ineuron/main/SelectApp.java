package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Student;

public class SelectApp
{
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration();
		configuration.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// retrieving traget details :
		Student s1 = session.get(Student.class, 12);
		Student s2 = session.get(Student.class, 13);
		Student s3 = session.get(Student.class, 14);
	
		// printing target object contents
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3.toString());
		
	}
}
