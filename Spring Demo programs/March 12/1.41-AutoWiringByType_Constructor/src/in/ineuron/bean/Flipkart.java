package in.ineuron.bean;

import java.util.Arrays;
import java.util.Random;

//Target Object
public class Flipkart
{

	// Dependent Object
	private Courier courier;

	private int productId;

	// Constructor Injection
	public Flipkart(Courier courier)
	{
		System.out.println("Courier object is injected through Constructor");
		this.courier = courier;
	}

	public void setProductId(int productId)
	{
		System.out.println("Flipkart.setProductId()###############################");
		this.productId = productId;
	}

	static
	{
		System.out.println("Flipkart.class file is loading...");
	}

	public Flipkart()
	{
		System.out.println("Flipkart object is created...");
	}

	// Setter Injection
	public void setCourier(Courier courier)
	{
		this.courier = courier;
		System.out.println("Courier object is injected through Setter");
	}

	// BUISNESS LOGIC
	public String shopping(String[] items, float[] prices)
	{

		System.out.println("*************Shopping and apyment completed***********");
		System.out.println(courier.getClass().getName());
		return "";
	}
}
