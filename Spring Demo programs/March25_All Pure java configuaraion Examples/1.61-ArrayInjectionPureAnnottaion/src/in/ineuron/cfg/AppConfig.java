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
		System.out.println("AppConfig.class file is loading..............");
	}

	public AppConfig()
	{
		System.out.println("AppConfig zero param constrcutor");
	}

	@Bean("marks")
	public int[] getMarks()
	{
		int marks[] = { 23, 45, 65 };

		return marks;
	}

	@Bean("dates")
	public Date[] getDateArray() {
	    Date sysDate = new Date();
	    Date dob = new Date();
	    dob.setYear(110);
	    dob.setMonth(5);
	    return new Date[]{sysDate, dob};
	}

}
