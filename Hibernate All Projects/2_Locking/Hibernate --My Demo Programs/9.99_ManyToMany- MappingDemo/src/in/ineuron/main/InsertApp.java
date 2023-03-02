package in.ineuron.main;

import java.io.File;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Course;
import in.ineuron.pojo.Student;

public class InsertApp
{
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration();

		configuration.configure("in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		boolean flag = false;

		try
		{
			transaction = session.beginTransaction();

			// creating dependent Objects
			Course course1 = new Course("C1", "Java", 2000);
			Course course2 = new Course("c2", "JDBC", 100);
			Course course3 = new Course("c3", "Servlets", 139);
			Course course4 = new Course("c4", "JSp", 200);
			Course course5 = new Course("c5", "SpringBoot", 500);

			// Multiple courses for mutiple students

			// for Student1
			Set<Course> set1 = new HashSet<>();
			set1.add(course1);
			set1.add(course5);

			// for Student2
			Set<Course> set2 = new HashSet<>();
			set1.add(course3);
			set1.add(course4);

			// for Student3
			Set<Course> set3 = new HashSet<>();
			set1.add(course2);
			set1.add(course1);

			// Creating Target Objects
			Student student1 = new Student("safvan", 23, set1);

			Student student2 = new Student("Riyan", 16, set2);

			Student student3 = new Student("Nisil", 23, set3);

			// saving
			Serializable pk1 = session.save(student1);
			Serializable pk2 = session.save(student2);
			Serializable pk3 = session.save(student3);

			flag = true;

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			if (flag)
			{
				System.out.println("Objects saved .....");
				transaction.commit();
			} else
			{
				System.out.println("Object saving failed ...........");
				transaction.rollback();
			}
		}

	}
}
