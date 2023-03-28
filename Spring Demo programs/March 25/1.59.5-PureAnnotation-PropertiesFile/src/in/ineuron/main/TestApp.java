package in.ineuron.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.target.WishMessageGenerator;

public class TestApp
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// gettig bean using bean class name
		WishMessageGenerator wmg = applicationContext.getBean(WishMessageGenerator.class);

		wmg.printDate();
	}
}
