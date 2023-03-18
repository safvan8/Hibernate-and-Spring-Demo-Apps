package in.ineuron.bean;

import org.springframework.beans.factory.annotation.Required;

public class Robot
{
	private Integer id;
	private String name;
	private String lab;
	private double price;

	@SuppressWarnings("deprecation")
	@Required
	public void setId(Integer id)
	{
		this.id = id;
	}

	@SuppressWarnings("deprecation")
	@Required
	public void setName(String name)
	{
		this.name = name;
	}

	public void setLab(String lab)
	{
		this.lab = lab;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Robot [id=" + id + ", name=" + name + ", lab=" + lab + ", price=" + price + "]";
	}

}
