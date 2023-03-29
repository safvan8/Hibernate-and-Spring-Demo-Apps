package in.ineuron.dao;

import in.ineuron.bo.CustomerBO;

//  defining dao SRS in inerface
public interface ICustomerDAO
{
	//  SRS in DAO for persistence operation
	// implementation class object of Serice layer (CustomerServiceImpl) will make a
	// call to this for persisternce operation
	public abstract int insert(CustomerBO bo);
}
