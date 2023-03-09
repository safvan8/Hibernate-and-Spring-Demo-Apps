package com.durgasoft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Branch;
import com.durgasoft.beans.Student;

public class Test
{
	public static void main(String[] args)
	{
		// Creating Bean objects in this step and objects will be managed by
		// ApplicationContext
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/durgasoft/resources/applicationContext.xml");

		Student s1 = (Student) applicationContext.getBean("studentBean");
		System.out.println(s1.getStudent());

		Branch b1 = (Branch) applicationContext.getBean("branchBean");
		System.out.println(b1.getBranch());
	}
}
