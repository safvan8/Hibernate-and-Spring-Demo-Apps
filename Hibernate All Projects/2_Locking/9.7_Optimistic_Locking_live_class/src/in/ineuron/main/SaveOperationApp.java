package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.model.InsurancePolicy;
public class SaveOperationApp
{

	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		boolean flag = false;

		try
		{

			if (transaction != null)
			{
				InsurancePolicy policy = new InsurancePolicy();
				policy.setCompany("LIC");
				policy.setPolicyName("JeevanAnand");
				policy.setPolicyType("yearly");
				policy.setTenure(25);
				session.save(policy);
				flag = true;

			}
		} catch (HibernateException e)
		{
			e.printStackTrace();
		} finally
		{
			if (flag == true)
				transaction.commit();
			else
				transaction.rollback();

			session.close();
		}

	}

}
