package in.ineuron.bean;

public class MyCar
{
	private String company;
	private String model;

	private String color;
	private String owner;

	public MyCar(String company, String model, String color, String owner)
	{

		this.company = company;
		this.model = model;
		this.color = color;
		this.owner = owner;
	}

	@Override
	public String toString()
	{
		return "MyCar [company=" + company + ", model=" + model + ", color=" + color + ", owner=" + owner + "]";
	}

}
