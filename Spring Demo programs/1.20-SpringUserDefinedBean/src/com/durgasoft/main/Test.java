package com.durgasoft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Student;

public class Test
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/durgasoft/resources/applicationContext.xml");

		Student safvan = (Student) applicationContext.getBean("studentBean");
		safvan.getStudentDetails();

	}
}
