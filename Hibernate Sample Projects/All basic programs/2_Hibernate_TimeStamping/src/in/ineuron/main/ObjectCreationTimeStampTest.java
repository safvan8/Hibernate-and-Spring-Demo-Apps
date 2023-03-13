package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.BankAccount;

public class ObjectCreationTimeStampTest
{

	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");
		Session session = config.buildSessionFactory().openSession();
		Transaction transaction = null;
		Long idValue = null;
		boolean flag = false;

		BankAccount account = new BankAccount();

		account.setHolderName("safvan P");
		account.setBalance(67478934.98);
		account.setType("savings");
		try
		{
			transaction = session.beginTransaction();
			idValue=(Long) session.save(account);
			flag = true;
			System.out.println("Account no generated is :: " + idValue);
		} catch (Exception e)
		{
			e.printStackTrace();
			flag = false;
		} finally
		{
			if (flag)
			{
				transaction.commit();
				System.out.println("Object is saved...");
				System.out.println("Account is opened at :: " + account.getOpeningDate());
				System.out.println("Account is lastly modified at :: " + account.getLastUpdated());
				System.out.println("Account version is:: " + account.getVersion());
			} else
			{
				transaction.rollback();
				System.out.println("Object is not saved...");
			}

		}
	}

}
