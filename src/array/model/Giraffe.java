package array.model;

public class Giraffe
{
	private int legs;
	private int eyes;
	private String name;
	private double neckLength;
	private int spots;
	
	
	public Giraffe()
	{
		legs = 4;
		eyes =2;
		name = "Melman";
		neckLength = 7.0 ;
		spots = 200;
	}
	
	public Giraffe(int legs, int eyes, String name, double neckLength, int spots)
	{
		this.eyes = eyes;
		this.legs = legs;
		this.name = name;
		this.neckLength = neckLength;
		this.spots = spots;
	}

	public int getLegs()
	{
		return legs;
	}

	public int getEyes()
	{
		return eyes;
	}

	public String getName()
	{
		return name;
	}

	public double getNeckLength()
	{
		return neckLength;
	}


	public int getSpots()
	{
		return spots;
	}

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setNeckLength(double neckLength)
	{
		this.neckLength = neckLength;
	}

	public void setSpots(int spots)
	{
		this.spots = spots;
	}
}
