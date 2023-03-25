package in.ineuron.dao;

import in.ineuron.bo.CustomerBO;

// 9: defining dao SRS in inerface
public interface ICustomerDAO
{
	// 10 : SRS in DAO for persistence operation
	// implementation class object of Serice layer (CustomerServiceImpl) will make a
	// call to this for persisternce operation
	public abstract int insert(CustomerBO bo);
}
