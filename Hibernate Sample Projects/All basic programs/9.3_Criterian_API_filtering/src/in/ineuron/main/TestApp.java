package in.ineuron.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.internal.build.AllowSysOut;

import in.ineuron.model.Project;
import in.ineuron.util.HibernateUtil;

public class TestApp
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{

		Session session = HibernateUtil.getSession();

		/*
		 * try { Criteria criteria = session.createCriteria(Project.class);
		 * List<Project> list = criteria.list(); list.forEach(System.out::println);
		 * 
		 * } catch (Exception e) {
		 * 
		 * } finally { HibernateUtil.closeSession(session);
		 * HibernateUtil.closeSessionFactory(); }
		 */

		try
		{

//			//creating criterian object
//			Criteria criteria = session.createCriteria(Project.class);
//
//			// setting columns which need to be retrievd 
//			PropertyProjection p1 = Projections.property("teamSize");
//			PropertyProjection p2 = Projections.property("location");
//			PropertyProjection p3 = Projections.property("projName");
//
//			// creating a projectionlist to add multiple columns
//			ProjectionList plist = Projections.projectionList();
//			plist.add(p3);
//			plist.add(p2);
//			plist.add(p1);
//
//			// setting column names need to retrived with criteria object
//			criteria.setProjection(plist);
//
//			// where teamsize >=10 and teamsize <=20
//			Criterion cond1 = Restrictions.ge("teamSize", 10);
//			Criterion cond2 = Restrictions.le("teamSize", 20);
//
//			criteria.add(cond1);
//			criteria.add(cond2);
//
//			//order by location asc , project name desc
//			Order order1 = Order.asc("location");
//			Order order2 = Order.desc("projName");
//
//			criteria.addOrder(order1);
//			criteria.addOrder(order2);
//
//			// collecting to objact array sice we are selecting onley few columns.
//			// if we select all clumns , we can give object name
//			List<Object[]> list = criteria.list();
//			System.out.println("ProjectName\t\tLocation\t\tTeamsize");
//			list.forEach(row->{
//				for (Object obj : row) {
//						System.out.print(obj+ "\t\t");
//				}
//				System.out.println();
//			});

			// pagination code
			Criteria criteria = session.createCriteria(Project.class);

			// from 1st row
			criteria.setFirstResult(1);

			// to third row, fetching
			criteria.setMaxResults(3);

			List<Project> list = criteria.list();

			list.forEach(System.out::println);

		} catch (Exception e)
		{

		} finally
		{
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}
}
