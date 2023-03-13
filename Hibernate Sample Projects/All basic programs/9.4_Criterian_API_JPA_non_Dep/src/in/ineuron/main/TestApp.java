package in.ineuron.main;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.model.Project;
import in.ineuron.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();

		try {
			
			//Create criteriaBuilder object
			CriteriaBuilder builder = session.getCriteriaBuilder();

			//Creating a criteriaQuery object
			CriteriaQuery<Project> cQuery = builder.createQuery(Project.class);

			//Creating a root object to specify the Entity class name
			Root<Project> root = cQuery.from(Project.class);
			
			//adding the root object to Criteria Query object
			cQuery.select(root);

			//Preparing a query having criteria query object
			Query<Project> query = session.createQuery(cQuery);
			
			//Executing the JPA QBC logic
			List<Project> list = query.getResultList();
			
			//processing the result
			list.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}
}
