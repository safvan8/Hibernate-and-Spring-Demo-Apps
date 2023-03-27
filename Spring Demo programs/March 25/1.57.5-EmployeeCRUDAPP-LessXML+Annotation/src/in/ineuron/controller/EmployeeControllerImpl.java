package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.EmployeeDTO;
import in.ineuron.service.IEmployeeService;
import in.ineuron.vo.EmployeeVO;

// no need bean Id , we are not injecting controller anywhere
// default bean id is class name in camelcase
@Component
public class EmployeeControllerImpl implements IEmployeeController {

	@Autowired
	private IEmployeeService service;

	static {
		System.out.println("EmployeeControllerImpl.class file is loading..............");
	}
	public EmployeeControllerImpl()
	{
		System.out.println("EmployeeControllerImpl Zero param constructor..............");
	}
	
	@Override
	public String save(EmployeeVO vo) {
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setEaddress(vo.getEaddress());
		dto.setEage(Integer.parseInt(vo.getEage()));
		
		
		
		return service.save(dto);
	}
	

	@Override
	public List<EmployeeVO> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeVO findById(Integer eid) {
		service.findById(eid);
		return null;
	}

	@Override
	public String updateById(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public String toString() {
		return "EmployeeControllerImpl [service=" + service + "]";
	}
	
}
