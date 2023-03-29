package in.ineuron.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("component")
public class College
{
	// autowring names , list

	// qulafier is not required , since we only have one depden object type
	@Autowired
	private List<String> nameList;

	static
	{
		System.out.println("College.class file is loading...");
	}

	public College()
	{
		System.out.println("College object is instantiated...");
	}

	@Override
	public String toString()
	{
		return "College [nameList=" + nameList + "]";
	}

}
