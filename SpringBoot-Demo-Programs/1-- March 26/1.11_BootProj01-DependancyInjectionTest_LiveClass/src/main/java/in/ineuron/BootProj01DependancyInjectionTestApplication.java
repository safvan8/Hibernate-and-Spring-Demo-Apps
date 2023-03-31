package in.ineuron;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.target.Target;

@SpringBootApplication
public class BootProj01DependancyInjectionTestApplication
{

	public static void main(String[] args)
	{
		System.out.println("****Container stared******\n");
		ApplicationContext appContxt = SpringApplication.run(BootProj01DependancyInjectionTestApplication.class, args);

		System.out.println("impl class of ApplicationContext created by IOC:: " + appContxt.getClass().getName());

		System.out.println("All Beand Ids are:: " + Arrays.toString(appContxt.getBeanDefinitionNames()));

		Target target = appContxt.getBean(Target.class);
		System.out.println(target);

	}

	@Bean
	public LocalDate createSysDate()
	{
		return LocalDate.now();
	}

	// static block and constructor
	static
	{
		System.out.println("BootP--estApplication.class file loading.......");
	}

	public BootProj01DependancyInjectionTestApplication()
	{
		System.out.println("BootP--estApplication obj creation: zero arg constructor ");
	}

}
