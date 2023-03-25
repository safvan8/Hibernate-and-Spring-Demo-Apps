package in.ineuron.service;

import in.ineuron.dto.CustomerDTO;

// 2: abstract services 
public interface ICustomerMgmtService
{
	// 3: decaring service method as abstract
	public abstract String calculateSimpleInterest(CustomerDTO dto);
}

