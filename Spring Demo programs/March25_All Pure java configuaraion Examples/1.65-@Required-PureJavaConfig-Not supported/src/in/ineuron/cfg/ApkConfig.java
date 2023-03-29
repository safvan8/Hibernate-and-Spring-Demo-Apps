package in.ineuron.cfg;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.ineuron")
public class ApkConfig
{
	// since LoaclDate is Nullabale , not injecting

	// util date is Mandatory so insrting...
	@Bean
	public Date getUtilDate()
	{
		return new Date();
	}
}
