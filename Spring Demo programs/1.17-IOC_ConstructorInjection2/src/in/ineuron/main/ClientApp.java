package in.ineuron.main;

import java.io.File;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.bean.Employee;

public class ClientApp
{
	public static void main(String[] args)
	{
		FileSystemResource fileSystemResource = new FileSystemResource(new File("./src/applicationContext.xml"));
		
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(fileSystemResource);
		
		Employee bean = xmlBeanFactory.getBean("employee",Employee.class);
		
		System.out.println(bean.toString());
	}
}
