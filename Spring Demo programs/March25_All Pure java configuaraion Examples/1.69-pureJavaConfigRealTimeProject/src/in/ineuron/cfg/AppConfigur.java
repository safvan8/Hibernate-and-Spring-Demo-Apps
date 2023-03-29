package in.ineuron.cfg;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration // this class is alternative to XML
@ComponentScan(basePackages = "in.ineuron")
@PropertySource(value = "in/ineuron/commons/application.properties") // ;ocation of properties
public class AppConfigur
{
	// autowiring done by IOC conatiner internally
	@Autowired
	private Environment environment;

	@Bean(name = "hikariDSName")
	public DataSource getHikariDataSource()
	{
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName(environment.getProperty("jdbc.driver"));
		dataSource.setJdbcUrl(environment.getProperty("jdbc.url"));
		dataSource.setUsername(environment.getProperty("jdbc.user"));
		dataSource.setPassword(environment.getProperty("jdbc.password"));
		return dataSource;
	}

	static
	{
		System.out.println("AppConfigur.class file is loading.............");
	}

	public AppConfigur()
	{
		System.out.println("AppConfigur object creation :zero param constrcutor........");
	}
}
