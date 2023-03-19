package in.ineuron.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Dependent class Configuration using Annotation

@Component("dtdc")
@Scope("prototype")
public class DTDC implements Courier
{
	static
	{
		System.out.println("DTDC.class file is loading...");
	}

	public DTDC()
	{
		System.out.println("DTDC object is created...");
	}

	@Override
	public String deliver(int oid)
	{
		return "DTDC courier will deliver with the order id ::" + oid + " order products";
	}
}
