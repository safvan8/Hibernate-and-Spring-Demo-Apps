package in.ineuron.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.Target.Target;
import in.ineuron.cfg.ApkConfig;

public class TestApp
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApkConfig.class);
		Target target = context.getBean(Target.class);
		
		System.out.println(target);
	}
}
