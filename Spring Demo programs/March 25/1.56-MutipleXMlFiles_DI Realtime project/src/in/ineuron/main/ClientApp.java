package in.ineuron.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.controller.CustomerController;
import in.ineuron.vo.CustomerVO;

// 24 :Creating client application : to accept inpt from user input 
//in the form of value Object (CustomerVO)
public class ClientApp
{
	public static void main(String[] args) throws IOException
	{
		// 27: for performin dependency injection
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		System.out.println("bean instantiation completed for all Singleton beans");

		// 25 : accepting user input from Customer
		// in web apps this done via html forms
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter customer name ::");
		String customerName = bufferedReader.readLine();

		System.out.println("Enter customer Address ::");
		String customerAddress = bufferedReader.readLine();

		System.out.println("Enter  PrinicipalAmount ::");
		String principalAmount = bufferedReader.readLine();

		System.out.println("Enter Rate of Intrest ::");
		String rateOfInterest = bufferedReader.readLine();

		System.out.println("Enter time Of Dposit in years ::");
		String timeOfDeposit = bufferedReader.readLine();

		// 26 : creating VO object with user entered values
		// in webapps continer will create requset object for this
		CustomerVO vo = new CustomerVO();
		vo.setCustomerName(customerName);
		vo.setCustomerAddress(customerAddress);
		vo.setPrincipalAmount(principalAmount);
		vo.setRateOfInterest(rateOfInterest);
		vo.setTimeOfDeposit(timeOfDeposit);

		// getting object of bean from Container
		CustomerController controller = applicationContext.getBean("controller", CustomerController.class);

		// 28: pass vo to controller
		String result = controller.processResult(vo);

		if ("success".equals(result))
			System.out.println("rows inserted sucessfully");
		else if ("failed".equals(result))
			System.out.println("row inserting failed");
		else
			System.out.println("Something went wrong");

	}
}
