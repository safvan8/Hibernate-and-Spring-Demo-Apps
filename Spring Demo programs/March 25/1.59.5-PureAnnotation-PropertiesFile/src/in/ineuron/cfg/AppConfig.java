package in.ineuron.cfg;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "in.ineuron") // scan this package for sterotype annotations bean obj creation
@PropertySource(value = "in/ineuron/commons/application.properties") // property file
public class AppConfig
{
	// to get multiple values from properties file
	@Autowired // maintained by spring internally
	private Environment env;

	static
	{
		System.out.println("AppConfig.class file is laoding...................");
	}

	public AppConfig()
	{
		System.out.println("AppConfig zero param constructor called........");
	}

	// no need of bean name actually, snice we only have one depdendent bea
	// this method is the only method creatig depednednt bean of LocalDate type
	@Bean("dobDependentBean") 
	public LocalDate getDob()
	{
		// getting value saved by spring inside env
		String name = env.getProperty("info.name");
		String job = env.getProperty("info.job");

		System.out.println("Hi  --- " + name);
		System.out.println("Never give up" + job);
		
		LocalDate dob = LocalDate.of(2001, 06, 03);
		
		return dob;
	}
}
