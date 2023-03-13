package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.InsurancePolicy;

public class Demo1_FirstLevelCache_SavingObjects_prerequisites
{

	public static void main(String[] args)
	{

		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibrenate.cfg.xml");
		Session session = config.buildSessionFactory().openSession();
		Transaction transaction = null;

		boolean flag = false;
		transaction = session.beginTransaction();

		Long generated_pk = 0L;

		InsurancePolicy policy = new InsurancePolicy();
		policy.setCompany("LIC");
		policy.setPolicyName("max life");
		policy.setPolicyType("yearly");
		policy.setTenure(6);
		try
		{
			generated_pk = (Long) session.save(policy);

			System.out.println(policy);
			;
			policy.setTenure(9);
			session.update(policy);

			policy.setTenure(30);
			session.update(policy);

			flag = true;

		} catch (Exception e)
		{
			e.printStackTrace();
			flag = false;
		} finally
		{
			if (flag)
			{
				transaction.commit();
				System.out.println("Object inserted .. with policyId ::" + generated_pk);

			} else
			{
				transaction.rollback();
				System.out.println("object insertion failed...");
			}
			session.close();
		}
	}
}
