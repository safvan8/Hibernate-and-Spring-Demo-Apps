package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.InsurancePolicy;

public class Demo2_FirstLevelCache_Getting_savedObjects
{

	public static void main(String[] args)
	{

		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibrenate.cfg.xml");
		Session session = config.buildSessionFactory().openSession();

		InsurancePolicy policy = null;

		Transaction transaction = null;
		Long idValue = null;

		boolean flag = false;

		try
		{
			policy = session.get(InsurancePolicy.class, 1L);

			if (policy == null)
			{
				System.out.println("Record not found...");
			} else
			{
				System.out.println("Record found and displayed...");
				System.out.println(policy);
				transaction = session.beginTransaction();
				policy.setTenure(9);
				session.update(policy);

				policy.setTenure(30);
				session.update(policy);

				flag = true;
			}

		} catch (Exception e)
		{
			e.printStackTrace();
			flag = false;
		} finally
		{
			if (flag)
			{
				transaction.commit();
				System.out.println("object updated...");

			} else
			{
				transaction.rollback();
				System.out.println("object not updated...");
			}
			session.close();
		}
	}
}
