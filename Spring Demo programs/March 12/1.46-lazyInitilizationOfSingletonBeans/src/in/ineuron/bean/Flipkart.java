package in.ineuron.bean;

import java.util.Arrays;
import java.util.Random;

//Target Object
public class Flipkart {

	// Dependent Object
	private Courier courier;

	static {
		System.out.println("Flipkart.class file is loading...");
	}

	public Flipkart() {
		System.out.println("Flipkart object is created...");
	}

	//Constructor Injection
	public Flipkart(Courier courier) {
		System.out.println("Courier object is injected through Constructor");
		this.courier = courier;
	}

	//Setter Injection
	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Courier object is injected through Setter");
	}

	//BUISNESS LOGIC
	public String shopping(String[] items, float[] prices) {
		System.out.println("Flipkart.shopping()");
		System.out.println(courier.getClass().getName());
		Random random = null;
		float billAmt = 0.0f;
		int oid = 0;
		for (float price : prices) {
			billAmt += price;
		}
		random = new Random();
		oid = random.nextInt(1000);
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + "are purchase having prices " + Arrays.toString(prices)
				+ " with the bill amount :: " + billAmt + "---> " + msg;
	}
}
