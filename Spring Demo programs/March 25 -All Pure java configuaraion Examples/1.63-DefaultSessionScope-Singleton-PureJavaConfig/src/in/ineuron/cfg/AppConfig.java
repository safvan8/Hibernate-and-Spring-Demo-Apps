package in.ineuron.cfg;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.ineuron")
public class AppConfig
{
	static
	{
		System.out.println("AppConfig.class file loading");
	}

	public AppConfig()
	{
		System.out.println("AppConfig zero param constructor....");
	}

	@Bean("utilDate")
	public Date getUtilDate()
	{
		return new Date();
	}
}
