package in.ineuron.cfg;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("in.ineuron")
@Lazy // restricting eager loading feature of singleton bean,
		//Now this will follow Lazy loading
public class ApkConfig
{
	// this method is always is always called for intsnatiantng Date bean
	// NO matter , we injecting it to target or not ,
	// Object will be created and saved in cache
	@Bean
	public Date getUtilDate()
	{
		System.out.println("getUtilDate called.............");
		return new Date();
	}

	static
	{
		System.out.println("Appconfig.class file is laoding");
	}

	public ApkConfig()
	{
		System.out.println("AppConfig object creation........");
	}
}
