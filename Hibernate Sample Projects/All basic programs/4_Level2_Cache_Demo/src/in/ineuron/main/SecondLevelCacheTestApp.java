package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.ineuron.Model.InsurancePolicy;
import in.ineuron.util.HibernateUtil;

public class SecondLevelCacheTestApp
{

	public static void main(String[] args)
	{

		Session session = null;
		InsurancePolicy policy = null;

		session = HibernateUtil.getSession();

		try
		{
			policy = session.get(InsurancePolicy.class, 1L);// get from DB keep in L2 and L1 cache
			System.out.println("1:: " + policy);

			policy = session.get(InsurancePolicy.class, 1L);// get from L1 cache
			System.out.println("2:: " + policy);

			session.evict(policy);// remove from L1 cache
			System.out.println("\n policy object removed from L1 cache..But present in L2...\n\n");

			policy = session.get(InsurancePolicy.class, 1L);// get from L2 cache and keep it in L1 cache
			System.out.println("3:: " + policy);

			System.out.println("--------------");
			session.clear(); // removes all the objects from L1 cache
			System.out.println("\n Again ! policy object removed from L1 cache ..But present in L2...\n\n");
			
			// timeToIdleSeconds="10" configured in ehcache.xml
			// so L2 cache will expire after 10 seconds
			try
			{
				Thread.sleep(20000);// 20seconds idle time for the application,so L2 cache will be expired
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			} finally
			{
				System.out.println("10 seconds passed, L2 cache cleared......");
			}

			policy = session.get(InsurancePolicy.class, 1L);// hit the db and get the record keep in L2 and L1 cache
			System.out.println("4:: " + policy);

		} catch (HibernateException e)
		{
			e.printStackTrace();
		}

	}

}
