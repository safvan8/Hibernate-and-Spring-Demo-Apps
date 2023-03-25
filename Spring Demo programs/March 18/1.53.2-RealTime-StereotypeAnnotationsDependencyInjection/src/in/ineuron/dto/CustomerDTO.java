package in.ineuron.dto;

// Strating developement from here
public class CustomerDTO
{
	// decalring dto properties
	private String customerName;
	private String customerAddress;
	private Float pricipalAmount;
	private Float rateOfInterest;
	private Float timeOfDesposit;

	// Creatig setters and getter along with toString()

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCustomerAddress()
	{
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress)
	{
		this.customerAddress = customerAddress;
	}

	public Float getPricipalAmount()
	{
		return pricipalAmount;
	}

	public void setPricipalAmount(Float principalamt)
	{
		this.pricipalAmount = principalamt;
	}

	public Float getRateOfInterest()
	{
		return rateOfInterest;
	}

	public void setRateOfInterest(Float rateOfInterest)
	{
		this.rateOfInterest = rateOfInterest;
	}

	public Float getTimeOfDesposit()
	{
		return timeOfDesposit;
	}

	public void setTimeOfDesposit(Float timeOfDesposit)
	{
		this.timeOfDesposit = timeOfDesposit;
	}

	@Override
	public String toString()
	{
		return "CustomerDTO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", principalamt="
				+ pricipalAmount + ", rateOfInterest=" + rateOfInterest + ", timeOfDesposit=" + timeOfDesposit + "]";
	}
}
