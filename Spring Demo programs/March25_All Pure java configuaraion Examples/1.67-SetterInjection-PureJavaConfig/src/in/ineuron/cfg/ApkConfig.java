package in.ineuron.cfg;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.ineuron")
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
}
