package org.scharati.javadespat.singleton1;

/**
 * Singleton Design Pattern
 * 
 */
public class Singleton {

	/**
	 * The instance of Singleton for usage
	 */
	private static Singleton instance;
	
	/**
	 * Private constructor
	 */
	private Singleton()
	{

	}
	
	/**
	 * @return Singleton instance
	 */
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			return new Singleton();
		}
		
		return instance;
	}
	

	
}
