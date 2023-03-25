package in.ineuron.bo;

// 5: Creating Customer BO object for Buisness Logic processing
public class CustomerBO
{
	// 6: declaring BO properties
	private String customerName;
	private String customerAddress;
	private Float principalamt;
	private Float rateOfIntrest;
	private Float timeOfDeposit;

	// 7: additinal property in BO for buisness logic
	private float interestAmount;

	// 8: adding setters and getters along with toString()
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

	public Float getPrincipalamt()
	{
		return principalamt;
	}

	public void setPrincipalamt(Float principalamt)
	{
		this.principalamt = principalamt;
	}

	public Float getRateOfInterest()
	{
		return rateOfIntrest;
	}

	public void setRateOfInterest(Float rateOfInterest)
	{
		this.rateOfIntrest = rateOfInterest;
	}

	public Float getTimeOfDesposit()
	{
		return timeOfDeposit;
	}

	public void setTimeOfDesposit(Float timeOfDesposit)
	{
		this.timeOfDeposit = timeOfDesposit;
	}

	public float getInterestAmount()
	{
		return interestAmount;
	}

	public void setInterestAmount(float interestAmount)
	{
		this.interestAmount = interestAmount;
	}

	@Override
	public String toString()
	{
		return "CustomerBO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", principalamt="
				+ principalamt + ", rateOfInterest=" + rateOfIntrest + ", timeOfDesposit=" + timeOfDeposit
				+ ", interestAmount=" + interestAmount + "]";
	}
}
