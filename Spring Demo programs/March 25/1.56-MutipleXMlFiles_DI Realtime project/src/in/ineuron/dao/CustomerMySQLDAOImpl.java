package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.PreparableStatement;

import in.ineuron.bo.CustomerBO;

//11: DAO layer wil take the buiness object from Customer Service layer
//and perform persistence operation
public class CustomerMySQLDAOImpl implements ICustomerDAO
{

	// 20 : To inject DataSource object from Spring Framework
	private DataSource dataSource;

	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO springdemodbo.customer_table "
			+ "(c_name,c_address,c_pamount,c_rate,c_time,c_interest_amount) VALUES (?,?,?,?,?,?)";

	static
	{
		System.out.println("CustomerMySQLDAOImpl.class file is loading.........");
	}

	// for performing Constructor injection
	public CustomerMySQLDAOImpl(DataSource dataSource)
	{
		System.out.println("CustomerMySQLDAOImpl:: one parame Constructor");
		System.out.println("DataSource Object Injected Successfully.........\n");
		this.dataSource = dataSource;
	}

	// Next step 21: Configure XML for Dependency Injection

	@Override
	public int insert(CustomerBO bo)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		int rowsInserted = 0;

		try
		{
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(CUSTOMER_INSERT_QUERY);

			// setting positional paramerters
			preparedStatement.setString(1, bo.getCustomerName());
			preparedStatement.setString(2, bo.getCustomerAddress());
			preparedStatement.setFloat(3, bo.getPrincipalamt());
			preparedStatement.setFloat(4, bo.getRateOfInterest());
			preparedStatement.setFloat(5, bo.getTimeOfDesposit());
			preparedStatement.setFloat(6, bo.getInterestAmount());

			// executing the query
			rowsInserted = preparedStatement.executeUpdate();

		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rowsInserted;
	}

}
