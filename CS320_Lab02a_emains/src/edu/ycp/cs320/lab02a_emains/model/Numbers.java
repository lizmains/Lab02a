package edu.ycp.cs320.lab02a_emains.model;

// model class for GuessingGame
// only the controller should be allowed to call the set methods
// the JSP will call the "get" and "is" methods implicitly
// when the JSP specifies game.min, that gets converted to
//    a call to model.getMin()
// when the JSP specifies if(game.done), that gets converted to
//    a call to model.isDone()
public class Numbers {
	private double first, second, third, result;
	
	public Numbers() {
	}
	
	public double getFirst()
	{
		return first;
	}
	
	public void setFirst(double first)
	{
		this.first = first;
	}
	
	public double getSecond()
	{
		return second;
	}
	
	public void setSecond(double second)
	{
		this.second = second;
	}
	
	public double getThird()
	{
		return third;
	}
	
	public void setThird(double third)
	{
		this.third = third;
	}
	public double getResult()
	{
		return result;
	}
	
	public void setResult(Double result)
	{
		this.result = result;
	}
	
	
}
