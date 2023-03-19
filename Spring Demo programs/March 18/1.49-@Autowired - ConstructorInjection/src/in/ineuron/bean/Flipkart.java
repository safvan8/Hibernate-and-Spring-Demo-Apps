package in.ineuron.bean;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Target Object
public class Flipkart
{

	// Dependent Object
	// default autowiring is "byType - autowiring"
	private Courier courier;
	
	// for construtor injection
	@Autowired
	public Flipkart(@Qualifier("fFlight") Courier courier)
	{
		this.courier = courier;
		System.out.println("Flipkart:: 1 arg constrcutor..........");
	}

	static
	{
		System.out.println("Flipkart.class file is loading...");
	}

	public Flipkart()
	{
		System.out.println("Flipkart object is created...");
	}

	// BUISNESS LOGIC
	public String shopping(String[] items, float[] prices)
	{
		System.out.println("Flipkart.shopping()");
		System.out.println(courier.getClass().getName());
		Random random = null;
		float billAmt = 0.0f;
		int oid = 0;
		for (float price : prices)
		{
			billAmt += price;
		}
		random = new Random();
		oid = random.nextInt(1000);
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + "are purchase having prices " + Arrays.toString(prices)
				+ " with the bill amount :: " + billAmt + "---> " + msg;
	}

	@Override
	public String toString()
	{
		return "Flipkart [courier=" + courier + "]";
	}

}
