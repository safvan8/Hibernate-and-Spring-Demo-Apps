package in.ineuron.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.controller.IEmployeeController;
import in.ineuron.vo.EmployeeVO;

public class TestApp
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// getting bean using class name
		IEmployeeController controller = context.getBean(IEmployeeController.class);
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
