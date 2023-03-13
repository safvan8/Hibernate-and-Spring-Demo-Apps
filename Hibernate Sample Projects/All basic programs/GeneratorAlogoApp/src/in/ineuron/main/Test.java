package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Employee;

public class Test
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Employee employee = new Employee();
		// no need to set id , explicitly
		employee.setEmpName("Nisil");
		employee.setEmpSal(88765.0);

		int genaerated_PrimaryKey = 0;
		boolean flag = false;

		try
		{
			// inserting record to db
		session.save(employee);
			flag = true;
		} catch (HibernateException e)
		{
			e.printStackTrace();
		} finally
		{
			if (flag)
			{
				tx.commit();
				System.out.println("Record inserted successfully for Employee: " + employee.getEmpName());
				System.out.println("generated primary key is:" + genaerated_PrimaryKey);
			} else
			{
				tx.rollback();
				System.out.println("record insertion failed");
			}

			session.close();
			sessionFactory.close();
		}
	}
}
