package in.ineuron.bean;

public class BlueDart implements Courier
{
	static
	{
		System.out.println("BlueDart.class file is loading...");
	}

	public BlueDart()
	{
		System.out.println("BlueDart object is instantiated...");
	}

	@Override
	public String deliver(int oid)
	{
		System.out.println("BlueDart.deliver()");

		return "";
	}

}
