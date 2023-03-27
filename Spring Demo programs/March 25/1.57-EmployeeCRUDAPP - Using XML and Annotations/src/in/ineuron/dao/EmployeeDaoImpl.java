package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.EmployeeBO;

@Repository("dao")
public class EmployeeDaoImpl implements IEmployeeDao
{
	private static final String INSERT_QUERY = "INSERT INTO springdemodbo.employee VALUES (?,?,?)";
	@Autowired
	@Qualifier("hikariDataSource")
	private DataSource dataSource;

	@Override
	public String save(EmployeeBO bo)
	{
		try (Connection connection = dataSource.getConnection() )
		{
			PreparedStatement pstm = connection.prepareStatement(INSERT_QUERY);
			
			pstm.setString(1,bo.getEname());	
			pstm.setString(2,bo.getEaddress());			

			pstm.setInt(3,bo.getEage());			
			
			int rowCount = pstm.executeUpdate();
			
			if (rowCount >0)
				System.out.println("success");
			else 
				System.out.println("Failed");
			
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<EmployeeBO> findAllEmployees()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBO findById(Integer eid)
	{
		try (Connection connection = dataSource.getConnection())
		{
			System.out.println(connection);
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String updateById(Integer eid)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer eid)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString()
	{
		return "EmployeeDaoImpl [dataSource=" + dataSource + "]";
	}

}
