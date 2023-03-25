package in.ineuron.vo;

//  Value object for accepting user input 
// value received from the user will be always in String Format
public class CustomerVO
{
	// declaring varaibles for recievig user input
	private String customerName;
	private String customerAddress;
	private String principalAmount;
	private String rateOfInterest;
	private String timeOfDeposit;

	// creating getters,setters and toString
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

	public String getPrincipalAmount()
	{
		return principalAmount;
	}

	public void setPrincipalAmount(String principalAmount)
	{
		this.principalAmount = principalAmount;
	}

	public String getRateOfInterest()
	{
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest)
	{
		this.rateOfInterest = rateOfInterest;
	}

	public String getTimeOfDeposit()
	{
		return timeOfDeposit;
	}

	public void setTimeOfDeposit(String timeOfDeposit)
	{
		this.timeOfDeposit = timeOfDeposit;
	}

	@Override
	public String toString()
	{
		return "CustomerVO [customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", principalAmount=" + principalAmount + ", rateOfInterest=" + rateOfInterest + ", timeOfDeposit="
				+ timeOfDeposit + "]";
	}
}
