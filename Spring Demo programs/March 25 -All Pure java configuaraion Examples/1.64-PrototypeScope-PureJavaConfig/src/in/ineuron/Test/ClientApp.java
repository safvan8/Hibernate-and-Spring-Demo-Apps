package in.ineuron.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.bean.WishMessgeGenerator;
import in.ineuron.cfg.AppConfig;

public class ClientApp
{

	public static void main(String[] args)
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("................IOC container created.....................");
		
		WishMessgeGenerator generator1 = context.getBean("wmg", WishMessgeGenerator.class);

		String message = generator1.generateWishMessage("SAFVAN");
		System.out.println(message);
	}
}
