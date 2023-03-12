package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.EngCourse;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		
		
		EngCourse course0 = factory.getBean("in.ineuron.bean.EngCourse#0",EngCourse.class);
		System.out.println(course0);
		
		System.out.println();
		
		EngCourse course1 = factory.getBean("in.ineuron.bean.EngCourse#1",EngCourse.class);
		System.out.println(course1);
		
		System.out.println();
		
	
		
	}
}
