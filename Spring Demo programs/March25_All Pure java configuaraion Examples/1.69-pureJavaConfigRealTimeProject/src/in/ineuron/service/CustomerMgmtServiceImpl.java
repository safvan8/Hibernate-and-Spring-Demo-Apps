package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CustomerBO;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;

/*  
service layer will calcualte the interest amount using Buisiness Logic 
and Create Business object (CustomerBO) and from the calacualted results.
then service layer will pass the Business objects to DAO layer for persitence operation.
Then DAO layer wil take the buiness object and perform persistence operation  */

@Service(value = "serviceBean")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService
{
	// automatic dependency injection ,
	// since we have only one implentation class for ICustomerDAO ,
	// IOC container by default performs byType Depndency injection
	// No chance for confusion , since we have one impl class
	@Autowired
	public ICustomerDAO dao;

	static
	{
		System.out.println("CustomerMgmtServiceImpl.class file is loading......");
	}

	@Override
	public String calculateSimpleInterest(CustomerDTO dto)
	{
		System.out.println("CustomerMgmtServiceImpl.calculateSimpleInterest()");

		Float pricipalAmount = dto.getPricipalAmount();
		Float rateOfInterest = dto.getRateOfInterest();
		Float timeOfDesposit = dto.getTimeOfDesposit();

		Float simpleInterest = 0.f;
		simpleInterest = (pricipalAmount * rateOfInterest * timeOfDesposit) / 100;

		System.out.println("Simple interest is :" + simpleInterest);

		// creating buisness object
		CustomerBO customerBO = new CustomerBO();
		customerBO.setCustomerName(dto.getCustomerName());
		customerBO.setCustomerAddress(dto.getCustomerAddress());
		customerBO.setPrincipalamt(pricipalAmount);
		customerBO.setRateOfInterest(rateOfInterest);
		customerBO.setTimeOfDesposit(timeOfDesposit);
		customerBO.setInterestAmount(simpleInterest);

		int rowCount = dao.insert(customerBO);

		String status = "";
		if (rowCount != 0)
			status = "success";
		else
			status = "failed";

		return status;
	}

}
