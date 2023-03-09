package in.ineuron.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.bean.WishMessageGenerator;

public class ClientApp
{
	public static void main(String[] args)
	{
		// using the FileSystemResource to locate the configuration file
		FileSystemResource fileSystemResource = new FileSystemResource("./src/applicationContext.xml");

		// Creating an IOC container
		XmlBeanFactory factory = new XmlBeanFactory(fileSystemResource);

		// Requesting IOC container to give the Object,searching will happen in cache
		// and if it is not found then object will created by loading and performing
		// constructor injection.
		WishMessageGenerator wmgBean = factory.getBean("wmg", WishMessageGenerator.class);

		// using the target object performing the operation and printing the result
		wmgBean.generateWishMessage("safvan Java Developer");
	}
}
