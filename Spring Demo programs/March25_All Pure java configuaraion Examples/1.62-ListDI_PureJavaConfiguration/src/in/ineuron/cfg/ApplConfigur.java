package in.ineuron.cfg;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.ineuron")
public class ApplConfigur
{
	static
	{
		System.out.println("ApplConfigur.class file is loading.........");
	}

	public ApplConfigur()
	{
		System.out.println("ApplConfigur object creation......");
	}
	
	@Bean
	public List<String> getStudentNames()
	{
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Safvan");
		arrayList.add("Ajfan");
		
		return arrayList;
	}
}
