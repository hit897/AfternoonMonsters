package Monsters.Model;

public class MarshmallowMonster
{
	private double numberOfLegs;
	private double amountOfHair;
	private int armCount;
	private int eyeCount;
	private int noseCount;
	private boolean hasBellyButton;
	private String name;
	
	public MarshmallowMonster(String name, int eyeCount, double numberOfLegs, double amountOfHair, int armCount, int noseCount, boolean hasBellyButton)
	{
		this.setName(name);
		this.eyeCount = eyeCount;
		this.numberOfLegs = numberOfLegs;
		this.amountOfHair = amountOfHair;
		this.armCount = armCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
	}
	public String getname()
	{
		return "Appleman";
	}
	public double getNumberOfLegs()
	{
		return numberOfLegs;
	}
	public double getAmountOfHair()
	{
		return amountOfHair;
	}
	public int getNoseCount()
	{
		return noseCount;
	}
	public int getArmCount()
	{
		return armCount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public boolean hasBellyButton()
	{
		return hasBellyButton;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
