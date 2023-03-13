package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Model.BankAccount;
import in.ineuron.util.HibernateUtil;

public class ObjectCreationTimeStampTest {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		Long idValue = null;
		boolean flag = false;

		session = HibernateUtil.getSession();
		BankAccount account = session.get(BankAccount.class, 1L);
		account.setHolderName("safvan P");
	
		try {
			transaction = session.beginTransaction();
			 session.saveOrUpdate(account);
			flag = true;
			System.out.println("Account no generated is :: " + idValue);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object is saved...");
				System.out.println("Account is opened at :: " + account.getOpeningDate());
				System.out.println("Account is lastly modified at :: " + account.getLastUpdated());
				System.out.println("Account version is:: " + account.getVersion());
			} else {
				transaction.rollback();
				System.out.println("Object is not saved...");
			}
			HibernateUtil.closeSession(session);
		}
	}

}
