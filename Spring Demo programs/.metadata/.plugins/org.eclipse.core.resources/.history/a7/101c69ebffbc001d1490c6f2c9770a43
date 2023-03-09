package in.ineuron.main;

import java.io.File;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.bean.Person;

public class ClientApp
{
	public static void main(String[] args)
	{
		FileSystemResource fileSystemResource = new FileSystemResource(new File("./src/applicationContext.xml"));
		
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(fileSystemResource);
		
		Person person = xmlBeanFactory.getBean("p", Person.class);
		
		System.out.println(person);
		
	}
}
