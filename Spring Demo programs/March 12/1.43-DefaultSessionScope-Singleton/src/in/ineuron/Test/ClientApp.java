package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.WishMessgeGenerator;

public class ClientApp {
	
	public static void main(String[] args) {

		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		
		
		WishMessgeGenerator generator1= factory.getBean("wmg", WishMessgeGenerator.class);
		
		//Searching will happen in cache, it is found so get it from cache only.
		WishMessgeGenerator generator2= factory.getBean("wmg", WishMessgeGenerator.class);
		
		
		System.out.println("Generator1 class object reference :: "+generator1.hashCode());
		System.out.println("Generator2 class object reference :: "+generator2.hashCode());
		
		
		
		
	}
}
