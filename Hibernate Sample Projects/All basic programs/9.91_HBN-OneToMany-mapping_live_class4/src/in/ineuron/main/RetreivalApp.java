package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.ineuron.model.Department;
import in.ineuron.util.HibernateUtil;

public class RetreivalApp {

	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			Department department = session.get(Department.class, "IPL-16");

			System.out.println(department);

		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
