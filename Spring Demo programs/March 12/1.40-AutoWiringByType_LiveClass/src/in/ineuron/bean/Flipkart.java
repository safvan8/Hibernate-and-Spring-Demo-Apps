package in.ineuron.bean;

import java.util.Arrays;
import java.util.Random;

//Target Object
public class Flipkart
{

	// Dependent Object
	private Courier courier;

	static
	{
		System.out.println("Flipkart.class file is loading...");
	}

	public Flipkart()
	{
		System.out.println("Flipkart object is created...");
	}

	// Constructor Injection
	public Flipkart(Courier courier)
	{
		System.out.println("Courier object is injected through Constructor");
		this.courier = courier;
	}

	// Setter Injection
	public void setCourier(Courier courier)
	{
		this.courier = courier;
		System.out.println("Courier object is injected through Setter");
	}

	// BUISNESS LOGIC
	public void shopping(String[] items, float[] prices)
	{
		System.out.println("*************Shopping and Payment Completed****************");
		System.out.println(courier.getClass().getName());

	}
}
