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
		flipkart.shopping(new String[] {"puma", "iphone" }, new float[] { 56000.0f, 75000.35f });

		applicationContext.close();
	}
}
