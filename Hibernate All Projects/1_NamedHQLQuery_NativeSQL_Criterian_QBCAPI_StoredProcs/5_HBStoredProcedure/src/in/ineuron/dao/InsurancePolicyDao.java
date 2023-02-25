package in.ineuron.dao;

import java.util.List;

import in.ineuron.Model.InsurancePolicy;

public interface InsurancePolicyDao {
	public List<InsurancePolicy> getPoliciesByTenure(int start, int end);
	public String[] getPolicyById(int id);
}
