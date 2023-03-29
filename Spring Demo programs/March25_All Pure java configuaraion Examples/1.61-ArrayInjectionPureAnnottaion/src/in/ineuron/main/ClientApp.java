package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.bean.StudentDetails;
import in.ineuron.cfg.AppConfig;

public class ClientApp
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		 StudentDetails studentDetails = applicationContext.getBean("StudentInfo",StudentDetails.class);
		 
		 System.out.println("\n\n");
		 
		 System.out.println(studentDetails);
	}
}
