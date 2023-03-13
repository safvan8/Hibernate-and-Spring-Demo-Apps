package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.InsurancePolicy;

public class Demo3_FirstLevelCache_DB_Intercation
{

	public static void main(String[] args)
	{

		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibrenate.cfg.xml");
		Session session = config.buildSessionFactory().openSession();

		InsurancePolicy policy = null;

		Transaction transaction = null;
		Long idValue = null;

		try
		{
			System.out.println("***************gets from DB and save it in L1-cach************************");
			policy = session.get(InsurancePolicy.class,1L);// gets from DB and put it in L1-cache
			System.out.println("1:: " + policy);

			policy = session.get(InsurancePolicy.class, 1L);// gets from L1cache , not going to DB
			System.out.println("2:: " + policy);
			System.out.println("=====================");


			session.evict(policy);// remove policy object from L1 cache
			System.out.println("***************policy Object removed from L1-Cache******************\n\n");

			System.out.println("calling get() to get Object ");
			policy = session.get(InsurancePolicy.class, 1L);// gets from DB and put it in L1-cache
			System.out.println("3:: " + policy);

			policy = session.get(InsurancePolicy.class, 1L);// gets from L1 cache
			System.out.println("4:: " + policy);
			System.out.println("========================\n");

			session.clear(); // remove all objects from L1-cache
			System.out.println("--------------all objects from the L1-cache removed -------------------------");
			
			System.out.println("calling get() to get Object ");
			policy = session.get(InsurancePolicy.class, 1L);// gets from DB and put it in L1-cache
			System.out.println("5:: " + policy);

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{

			session.close();
		}
	}
}
