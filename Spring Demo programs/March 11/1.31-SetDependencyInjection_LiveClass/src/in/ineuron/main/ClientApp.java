package in.ineuron.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

//import in.ineuron.bean.College;
import in.ineuron.bean.ContactsInfo;
//import in.ineuron.bean.MarksInfo;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		
		//Set object is injected
		ContactsInfo info = factory.getBean("cinfo", ContactsInfo.class);

		System.out.println(info);
		
		System.out.println("internally used Impl class is :: "+info.getPhoneNumbers().getClass().getName());

	}
}
