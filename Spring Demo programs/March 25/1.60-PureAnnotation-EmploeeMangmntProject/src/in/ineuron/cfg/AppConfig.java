package in.ineuron.cfg;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration // making class configurationfile and inheritting COmponnet nature for obj creation
@ComponentScan(basePackages = "in.ineuron") // to scan for all beans having stereotype annotation
@PropertySource(value = "in/ineuron/commons/application.properties")
public class AppConfig
{
	static
	{
		System.out.println("AppConfi.class file is loading.................");
	}

	public AppConfig()
	{
		System.out.println("AppConfig object creation by IOC conatiner :: zero param ");
	}

	// below object is created and internally mainatained by Spring
	@Autowired
	private Environment env;

	@Bean("Hikari")
	public DataSource getHikariDataSource()
	{
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName(env.getProperty("dao.info.driverClassName"));
		dataSource.setUsername(env.getProperty("dao.info.username"));
		dataSource.setPassword(env.getProperty("dao.info.password"));
		dataSource.setJdbcUrl(env.getProperty("dao.info.jdbcUrl"));
		dataSource.setMinimumIdle(Integer.parseInt(env.getProperty("dao.info.minIdle")));
		dataSource.setMaximumPoolSize(Integer.parseInt(env.getProperty("dao.info.maxPoolSize")));
		dataSource.setConnectionTimeout(Long.parseLong(env.getProperty("dao.info.conTimeOut")));
		return dataSource;
	}
}
