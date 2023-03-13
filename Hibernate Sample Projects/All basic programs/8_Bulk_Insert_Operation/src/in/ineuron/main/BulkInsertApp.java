package in.ineuron.main;

import in.ineuron.dao.InsurancePolicyDao;
import in.ineuron.dao.InsurancePolicyDaoImpl;

public class BulkInsertApp
{
	public static void main(String[] args)
	{
		InsurancePolicyDao insurancePolicyDao = null;

		insurancePolicyDao = new InsurancePolicyDaoImpl();
		insurancePolicyDao.transferPolicy();
	}
}
