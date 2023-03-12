package in.ineuron.bean;

public class Parrot
{
	private String place;
	private int age;

	private int numberOfLegs;

	public void setNumberOfLegs(int numberOfLegs)
	{
		this.numberOfLegs = numberOfLegs;
	}

	public void setPlace(String place)
	{
		this.place = place;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Parrot [place=" + place + ", age=" + age + ", numberOfLegs=" + numberOfLegs + "]";
	}

}
