package org.scharati.javadespat.singleton2;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	
	static private ChocolateBoiler instance;
	
	private ChocolateBoiler()
	{
		empty = true;
		boiled = false;
	}
	
	static ChocolateBoiler getInstance()
	{
		return instance;
	}
	
	
	public void fill()
	{
		if(isEmpty())
		{
			empty = false;
			boiled = false;
		}
	}
	
	public boolean isEmpty()
	{
		return empty;
	}
}
