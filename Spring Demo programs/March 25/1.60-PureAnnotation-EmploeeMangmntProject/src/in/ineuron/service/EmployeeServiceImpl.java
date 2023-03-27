package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.EmployeeBO;
import in.ineuron.dao.IEmployeeDao;
import in.ineuron.dto.EmployeeDTO;

@Service("serviceLayerBean")
public class EmployeeServiceImpl implements IEmployeeService
{
	static
	{
		System.out.println("EmployeeServiceImpl.class file is loading..............");
	}

	public EmployeeServiceImpl()
	{
		System.out.println("EmployeeServiceImpl Zero param constructor..............");
	}

	@Autowired
	private IEmployeeDao dao;

	@Override
	public String save(EmployeeDTO dto)
	{
		EmployeeBO bo = new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setEaddress(dto.getEaddress());
		bo.setEage(dto.getEage());

		return dao.save(bo);
	}

	@Override
	public List<EmployeeDTO> findAllEmployees()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO findById(Integer eid)
	{
		dao.findById(eid);
		return null;
	}

	@Override
	public String updateById(Integer eid)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer eid)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString()
	{
		return "EmployeeServiceImpl [dao=" + dao + "]";
	}

}
