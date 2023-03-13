package in.ineuron.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import in.ineuron.model.Project;

public class TestApp
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure();

		Session session = config.buildSessionFactory().openSession();
		try
		{

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			session.close();
		}
	}
}
