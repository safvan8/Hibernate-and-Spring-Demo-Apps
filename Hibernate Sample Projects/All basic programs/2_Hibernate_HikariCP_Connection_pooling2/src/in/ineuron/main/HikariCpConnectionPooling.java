package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.ineuron.Model.InsurancePolicy;
import in.ineuron.util.HibernateUtil;

public class HikariCpConnectionPooling
{
	public static void main(String[] args)
	{
		Session session = null;
		InsurancePolicy policy = null;
		session = HibernateUtil.getSession();

		try
		{
			policy = session.get(InsurancePolicy.class, 1L);
			if (policy != null)
			{
				System.out.println("Record found and displayed....");
				System.out.println(policy);
			} else
			{
				System.out.println("Record not found...");
			}

		} catch (HibernateException he)
		{
			he.printStackTrace();
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			HibernateUtil.closeSession(session);
		}
	}
}
