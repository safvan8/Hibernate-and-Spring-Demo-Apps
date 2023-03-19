package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Target Class
@Component("fpkt")
@Scope("prototype")
public class Flipkart
{
	// HAS - A refernce Varaible
	@Autowired // dependency injection through Reflection API
	@Qualifier("airIndia_newAlias") // injecting alias name ( we can give real / alias name )
	private Courier courier;

	static
	{
		System.out.println("Flipkart.class file is loading...");
	}

	public Flipkart()
	{
		System.out.println("Flipkart object is created...");
	}

	// BUISNESS LOGIC
	public void shopping(String[] items, float[] prices)
	{
		System.out.println("Flipkart.shopping(-,-).........");
		System.out.println("Impl class of courier is ::"+courier.getClass().getName());
		System.out.println("Shopping and Bill payment successfull");
	}

}
