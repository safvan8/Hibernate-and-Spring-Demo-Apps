package in.ineuron.Test;

import java.applet.AppletContext;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.bean.Flipkart;

public class ClientApp
{
	public static void main(String[] args)
	{

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"/in/ineuron/cfg/applicationContext.xml");

		// created object of all singleton beans, not only dtdc
		System.out.println("IOC container created");

	}
}
