package in.ineuron.main;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import in.ineuron.pojo.Employee;

public class TestApp
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("/in/ineuron/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try
		{
			// create CriteriaBuilder obejct
			CriteriaBuilder builder = session.getCriteriaBuilder();

			// creating criteriaQuery Object
			CriteriaQuery<Object[]> cQuery = builder.createQuery(Object[].class);

			// Creating a Root object to specify which entity (table) we want to retrieve
			// data from
			Root<Employee> root = cQuery.from(Employee.class);

			// adding the root object to Criteria Query object
			// selecting only few columns
			cQuery.multiselect(root.get("eid"), root.get("ename"), root.get("esalary"));

			// directly setting without uisng parameter
			javax.persistence.criteria.Predicate p = builder.equal(root.get("eaddress"), "KSA"); // eaddress = 'KSA'

			cQuery.where(p); // where eaddredd='KSA'

			// Preparing a query using the CriteriaQuery object we created earlier
			Query<Object[]> query = session.createQuery(cQuery);

			List<Object[]> resultList = query.getResultList();

			resultList.forEach(row ->
			{
				for (Object obj : row)
					System.out.print(obj + "\t");
			});

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
