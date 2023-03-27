package in.ineuron.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.controller.IEmployeeController;
import in.ineuron.vo.EmployeeVO;

public class TestApp
{
	public static void main(String[] args)
	{

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		// getting bean using default bean id
		IEmployeeController controller = factory.getBean("employeeControllerImpl", IEmployeeController.class);
		System.out.println(controller);

		Scanner sc = new Scanner(System.in);

		EmployeeVO vo = new EmployeeVO();

		System.out.println("Enter employee name :");
		vo.setEname(sc.nextLine());
		System.out.println("Enter employee address :");
		vo.setEaddress(sc.nextLine());
		System.out.println("Enter employee age :");
		vo.setEage(sc.next());
		
		controller.save(vo);

	}
}
