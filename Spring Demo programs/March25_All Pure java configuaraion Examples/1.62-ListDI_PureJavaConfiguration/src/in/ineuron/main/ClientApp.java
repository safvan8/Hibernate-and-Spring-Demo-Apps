package in.ineuron.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.bean.College;
import in.ineuron.cfg.ApplConfigur;

public class ClientApp
{
	public static void main(String[] args)
	{

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplConfigur.class);

		System.out.println();
		College college = context.getBean(College.class);
		System.out.println(college);
	}
}
