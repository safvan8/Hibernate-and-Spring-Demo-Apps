package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.Flipkart;

public class ClientApp
{
	public static void main(String[] args)
	{
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);

		flipkart.shopping(new String[] { "watch", "iphone" }, new float[] { 56000.0f, 75000.35f });

	}
}
