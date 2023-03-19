package in.ineuron.comp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

//Target Class

// specifying scanning location for properies file
@PropertySource(value = { "in/ineuron/commons/info.properties" })

// making class bean and giving bean id 'fpkt'
@Component("fpkt")
public class Flipkart
{
	// dependent Object
	@Autowired
	private Date orderDate;

	// injecting premitive values from properties File
	@Value("${fpkt.prdct.name}")
	private String productName;

	@Value("${fpkt.prdct.price}")
	private int price;

	// to inject values from Syste Properties
	@Value("${user.home}")
	private String userHome;

	@Value("${os.name}")
	private String osName;

	static
	{
		System.out.println("Flipkart.class file loading......");
	}

	public Flipkart()
	{
		System.out.println("Flipkart Object created...........");
	}

	@Override
	public String toString()
	{
		return "Flipkart [orderDate=" + orderDate + ", productName=" + productName + ", price=" + price + ", userHome="
				+ userHome + ", osName=" + osName + "]";
	}

}
