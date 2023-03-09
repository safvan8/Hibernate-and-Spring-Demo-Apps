package in.ineuron.bean;

import java.io.File;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestApp
{
	public static void main(String[] args)
	{
		// using the FileSystemResource to locate the configuration file
		FileSystemResource resource = new FileSystemResource(new File("./src/applicationContext.xml"));

		// Creating an IOC container
		XmlBeanFactory factory = new XmlBeanFactory(resource);

		//Requesting IOC container to give the Object
		// object will be created and perform dependency injection auatomatically
		WishMessgeGenerator generator = factory.getBean("wmg",WishMessgeGenerator.class);

		String message = generator.generateWishMessage("safvan");
		
		System.out.println(message);
		
	}
}