package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.Cat;
import in.ineuron.bean.Parrot;

public class ClientApp
{
	public static void main(String[] args)
	{

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		System.out.println("----------Cat object contents -----------");
		Cat cat = factory.getBean("cat-animal", Cat.class);
		System.out.println(cat);

		System.out.println("----------Parrot object contents -----------");
		Parrot parrot = factory.getBean("parrot-animal", Parrot.class);
		System.out.println(parrot);

	}
}
