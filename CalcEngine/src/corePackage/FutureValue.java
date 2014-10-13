package corePackage;

public class FutureValue {
	
	public double investment;
	private double yrs;
	private double rate;
	private double value;
	
	public FutureValue()
	{
		investment = 0;
		yrs = 0;
		rate = 0;
		value = 0;
	}
	
	public FutureValue(double i, double y, double r)
	{
		investment = i;
		yrs = y;
		rate = r;
		
		value = investment * (Math.pow(1 + rate/100, yrs));
	}
	
	public double getValue(){
		return value;
	}

}
