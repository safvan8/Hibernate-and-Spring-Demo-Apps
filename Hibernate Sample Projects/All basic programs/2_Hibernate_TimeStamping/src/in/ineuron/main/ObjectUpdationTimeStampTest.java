package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.BankAccount;

public class ObjectUpdationTimeStampTest
{

	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");
		Session session = config.buildSessionFactory().openSession();
		BankAccount account = null;
		Transaction transaction = session.beginTransaction();
		boolean flag = false;

		// getting record with Primary key 1
		account = session.get(BankAccount.class, 1L);

		if (account != null)
		{ // updating savings to current and removing initial from name and deposit
			account.setHolderName("Safvan");
			account.setType("current");
			account.setBalance(account.getBalance() + 200000);
		} else
		{
			System.out.println("Account not found......");
			System.exit(0);
		}
		try
		{

			transaction.commit();
			flag = true;
		} catch (HibernateException e)
		{
			e.printStackTrace();
			transaction.rollback();
			flag = false;
		} finally
		{
			if (flag)
			{
				System.out.println("Object updated...");
				System.out.println("Account is opened at :: " + account.getOpeningDate());
				System.out.println("Account is lastly modified  at :: " + account.getLastUpdated());
				System.out.println("Account latest version is:: " + account.getVersion());
			} else
			{
				System.out.println("Object modification failed......");
			}
		}
	}

}
