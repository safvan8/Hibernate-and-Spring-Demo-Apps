package in.ineuron.target;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator
{
	// adutoiring byType automatically
	@Autowired
	private LocalDate dob;

	static
	{
		System.out.println("WishMessageGenerator.class file is loading");
	}

	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator zero param constrctor called.......");
	}

	public void printDate()
	{
		System.out.println("-------------------------------------------");
		System.out.println("DOB is on ::" + dob);
		System.out.println("-------------------------------------------");

	}
}
