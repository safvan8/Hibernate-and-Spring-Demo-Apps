package in.ineuron.bean;

import java.util.Date;

//Target class-----> UserDefined
public class WishMessgeGenerator
{
	// Dependent class ---> Predefined
	// Has A reference Variable
	private Date date;

	static
	{
		System.out.println("WishMessgeGenerator.class file is loading....");
	}


	// constructor injection
	public WishMessgeGenerator(Date date)
	{
		System.out.println(" 1 arg constructor of Wish Message generatot: Constructor injection");
		System.out.println("injected date class object is ::"+date);
		this.date = date;
	}

	// BUSINESS logic to use Injected DATE in the Target class Object
	public String generateWishMessage(String name)
	{
		int hour = date.getHours();

		if (hour <= 12)
			return "Hello :: " + name + " Good morning!!!";
		else if (hour <= 16)
			return "Hello :: " + name + " Good Afternoon!!!";
		else if (hour <= 20)
			return "Hello :: " + name + " Good Evening!!!";
		else
			return "Hello :: " + name + " Good Night!!!";
	}
}
