package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.MyCar;

public class ClientApp
{
	public static void main(String[] args)
	{

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		System.out.println("CAR 1 Details ------------");
		MyCar car1 = factory.getBean("car1", MyCar.class);
		System.out.println(car1);

		System.out.println("CAR 2 Details ------------");
		MyCar car2 = factory.getBean("car2", MyCar.class);
		System.out.println(car2);

		/*
		 * org.springframework.beans.factory.BeanIsAbstractException: Error creating
		 * bean with name 'baseCar': Bean definition is abstract
		 * 
		 * MyCar baseCar = factory.getBean("baseCar", MyCar.class);
		 * System.out.println(baseCar);
		 */

	}
}
