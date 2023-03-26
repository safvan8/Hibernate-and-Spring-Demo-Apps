package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args)throws Exception {

		// passing AppConfig.class instead of applicationContext.xml
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("*****Container started*******\n");
		
		// directly getting bean using target class, no need to specify id , since we ony have one bean
		WishMessageGenerator wmg = factory.getBean(WishMessageGenerator.class);
		System.out.println(wmg);
		
		String msg = wmg.greetMessage("kohli");
		System.out.println(msg);
		
		((AbstractApplicationContext) factory).close();
		System.out.println("\n*****Container closed*******");
		
	}

}