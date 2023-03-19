package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Flipkart;

public class ClientApp
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		Flipkart flipkart = applicationContext.getBean("fpkt", Flipkart.class);

		System.out.println();

		System.out.println(flipkart);
	}
}
