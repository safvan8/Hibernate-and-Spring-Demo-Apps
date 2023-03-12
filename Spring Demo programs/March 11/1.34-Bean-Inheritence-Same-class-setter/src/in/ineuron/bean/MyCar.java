package in.ineuron.bean;

public class MyCar
{
	private String company;
	private String model;

	private String color;
	private String owner;

	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getOwner()
	{
		return owner;
	}

	public void setOwner(String owner)
	{
		this.owner = owner;
	}

	@Override
	public String toString()
	{
		return "MyCar [company=" + company + ", model=" + model + ", color=" + color + ", owner=" + owner + "]";
	}

}
