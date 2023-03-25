package in.ineuron.controller;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerMgmtService;
import in.ineuron.vo.CustomerVO;

// 13: creating controller

public class CustomerController
{

	// 14 : to inject service layer Object to Controller
	// HAS-A reference variable
	private ICustomerMgmtService service;

	static
	{
		System.out.println("CustomerController.class file is loading......");
	}

	// 15 :Creating constructor for Performinig Constructor injection
	public CustomerController(ICustomerMgmtService service)
	{
		System.out.println("CustomerController :: one param Constrcutor..........");
		System.out.println("CustomerMgmtService Object Injected Successfully.........\n");
		this.service = service;
	}

	// 16: method for processing result using CustomerVO object ( conatins user
	// input)
	public String processResult(CustomerVO vo)
	{
		// 29 : accept Vo and create DTO from VO object by converting String to required
		// data types
		// then pass to service layer for buiness logic processing and BO generation

		CustomerDTO customerDTO = new CustomerDTO();
		
		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setCustomerAddress(vo.getCustomerAddress());
		customerDTO.setPricipalAmount(Float.parseFloat(vo.getPrincipalAmount()));
		customerDTO.setRateOfInterest(Float.parseFloat(vo.getRateOfInterest()));
		customerDTO.setTimeOfDesposit(Float.parseFloat(vo.getTimeOfDeposit()));
		
		return service.calculateSimpleInterest(customerDTO);

	}

}
