package in.ineuron.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class InsurancePolicyDaoImpl implements InsurancePolicyDao
{
	// code for giving premium policy for customers who completed 25 years

	@Override
	public void transferPolicy()
	{

		Integer minimumYearsForPremiumPolicy = 25;

		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		int rowsUpdated = 0;

		boolean flag = false;

		try
		{
			// no return type for this insert query ,
			// ? is a wild chard symbol to indicate any type i can collect.
			Query<?> query = session.createQuery(
					"INSERT INTO in.ineuron.pojo.PremiumInsurancePolicy (policyId,policyName,policyType,company,tenure) "
							+ "SELECT i.policyId,i.policyName,i.policyType,i.company,i.tenure "
							+ "FROM in.ineuron.pojo.InsurancePolicy i WHERE i.tenure > :no_of_years ");

			// setting named parameter
			query.setParameter("no_of_years", minimumYearsForPremiumPolicy);

			rowsUpdated = query.executeUpdate();

			flag = true;
		} catch (HibernateException e)
		{
			flag = false;
			e.printStackTrace();

		} finally
		{
			if (flag)
			{
				System.out.println("No. of rows updated:: " + rowsUpdated);
				transaction.commit();

			} else
			{
				System.out.println("insetion failed");
				transaction.rollback();
			}
		}
	}
}
