package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import in.ineuron.pojo.InsurancePolicy;

public class FirstLevelCacheTest3
{
	public static void main(String[] args)
	{

		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibrenate.cfg.xml");
		Session session = config.buildSessionFactory().openSession();

		InsurancePolicy policy = null;
		InsurancePolicy policy2 = null;

		try
		{
			policy = session.get(InsurancePolicy.class, 1L);// hit db and put it in L1-cache
			System.out.println("first: " + policy);

			// get object from L1-cache and assign policy2 reference to existig object
			// Duplicate objects are not allowed in cache (like StringContantPool)
			policy2 = session.get(InsurancePolicy.class, 1L);
			System.out.println("second: " + policy2);

			System.in.read();

			System.out.println(policy.hashCode() + "::" + policy2.hashCode());

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}