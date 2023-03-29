package in.ineuron.service;

import in.ineuron.dto.CustomerDTO;

//  abstract services 
public interface ICustomerMgmtService
{
	// decaring service method as abstract
	public abstract String calculateSimpleInterest(CustomerDTO dto);
}

