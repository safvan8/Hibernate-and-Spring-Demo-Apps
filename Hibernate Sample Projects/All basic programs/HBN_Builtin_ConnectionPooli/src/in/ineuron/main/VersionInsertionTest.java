package in.ineuron.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Model.MobileCustomer;
import in.ineuron.util.HibernateUtil;

public class VersionInsertionTest {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		Integer idValue = null;
		boolean flag = false;

		session = HibernateUtil.getSession();
		MobileCustomer customer = new MobileCustomer();
		customer.setCname("sachin");
		customer.setMobileNo(999888776);
		customer.setCallerTune("4-2");

		try {
			transaction = session.beginTransaction();
			idValue = (Integer) session.save(customer);
			System.out.println("Generated id value is :: " + idValue);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object is saved...");
			} else {
				transaction.rollback();
				System.out.println("Object is not saved...");
			}
			HibernateUtil.closeSession(session);
		}
	}
}
