package in.ineuron.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Department;
import in.ineuron.pojo.Employee;

public class InsertApp
{
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration();
		configuration.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = null;

		Set<Employee> set = null;

		boolean flag = false;

		int deptId = 0;

		try
		{
			transaction = session.beginTransaction();

			// creating Dependendent Object
			Employee e1 = new Employee(1001, "safvan");
			Employee e2 = new Employee(1002, "Rinshad");
			Employee e3 = new Employee(1003, "nisil");

			// Creating a set - not allow Duplicates
			set = new HashSet<>();
			set.add(e1);
			set.add(e2);
			set.add(e3);

			// creating traget Object and injecting dependent Objects
			Department d1 = new Department(78909, "Super Developers", "KL", set);

			// saving
			deptId = (Integer) session.save(d1);

			flag = true;

		} catch (HibernateException he)
		{
			he.printStackTrace();
		} finally
		{
			if (flag)
			{
				transaction.commit();
				System.out.println("objects saved successfully");
				System.out.println("Saved department id is :" + deptId);
			} else
			{
				transaction.rollback();
				System.out.println("Object saving failed..");
			}
		}
	}
}
