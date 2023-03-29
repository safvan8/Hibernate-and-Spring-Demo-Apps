package in.ineuron.bean;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("StudentInfo")
public class StudentDetails
{

	@Autowired
	@Qualifier("marks")
	private int marks[];

	@Autowired
	@Qualifier("dates")
	private Date dates[];

	static
	{
		System.out.println("StudentDetails.class file loading.....");
	}

	public StudentDetails()
	{
		System.out.println("StduentDetails bean instantiation............");
	}

	@Override
	public String toString()
	{
		return "StudentDetails [marks=" + Arrays.toString(marks) + ", dates=" + Arrays.toString(dates) + "]";
	}

}
