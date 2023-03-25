package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerMgmtService;
import in.ineuron.vo.CustomerVO;

// creating controller

@Component(value = "controller")
public class CustomerController
{

	// automatic dependency injection ,
	// since we have only one implentation class ,
	// IOC container by default performs byType Depndency injection
	// No chance for confusion , since we have one impl class
	@Autowired
	private ICustomerMgmtService service;

	static
	{
		System.out.println("CustomerController.class file is loading......");
	}

	// method for processing result using CustomerVO object ( conatins user
	// input)
	public String processResult(CustomerVO vo)
	{
		// accept Vo and create DTO from VO object by converting String to required
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
