package in.ineuron.main;

import javax.persistence.ParameterMode;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.procedure.ProcedureCall;

public class StoredProcedureDemo
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Integer id = 3;

		try
		{
			// Create a ProcedureCall instance by providing the stored procedure name
			ProcedureCall procedureCall = session.createStoredProcedureCall("GET_POLICY_BY_ID");

			// Register input and output parameters
			procedureCall.registerParameter(1, Integer.class, ParameterMode.IN).bindValue(id);
			procedureCall.registerParameter(2, String.class, ParameterMode.OUT);
			procedureCall.registerParameter(3, String.class, ParameterMode.OUT);
			

			// Retrieve output parameter values
			String policyName = (String) procedureCall.getOutputParameterValue(2);
			String companyName = (String) procedureCall.getOutputParameterValue(3);
			
			if (policyName != null )
				System.out.println(policyName + "-------" + companyName + "------------" );
			else
				System.out.println("Policy not found for the given id ");
			
		} catch (HibernateException he)
		{
			he.printStackTrace();
		}
	}
}
