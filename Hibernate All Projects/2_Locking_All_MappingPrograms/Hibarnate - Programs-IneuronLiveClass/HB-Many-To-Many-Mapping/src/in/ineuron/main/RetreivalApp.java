package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtil;

public class RetreivalApp {

	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			Student s1 = session.get(Student.class, 1);
			System.out.println(s1);
			System.out.println();
			
			Student s2 = session.get(Student.class, 2);
			System.out.println(s2);
			System.out.println();
			
			Student s3 = session.get(Student.class, 3);
			System.out.println(s3);

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
