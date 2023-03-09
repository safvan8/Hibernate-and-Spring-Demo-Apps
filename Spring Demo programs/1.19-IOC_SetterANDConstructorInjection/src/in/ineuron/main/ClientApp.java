package in.ineuron.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.Person;

public class ClientApp
{
	public static void main(String[] args)
	{
		// Create a new instance of DefaultListableBeanFactory
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

		// Create a new instance of XmlBeanDefinitionReader with the beanFactory
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

		// Load the bean definitions from the XML configuration file into the
		// beanFactory
		// n represents the number of bean definitions that were loaded from the XML
		// configuration file applicationContext.xml.
		int n = reader.loadBeanDefinitions("in/ineuron/resources/applicationContext.xml");

		// Retrieve a bean named "personThorughConstructor" from the beanFactory and
		// cast it to the Person class
		Person person = beanFactory.getBean("personThorughConstructor", Person.class);

		System.out.println(person);

		System.out.println("No. Of beanDefinitions Loaded : " + n);
	}
}
