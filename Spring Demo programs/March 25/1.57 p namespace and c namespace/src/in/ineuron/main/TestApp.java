package in.ineuron.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Employee;

public class TestApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		Employee employee = factory.getBean("emp", Employee.class);
		System.out.println(employee);

		factory.close();
	}
}
