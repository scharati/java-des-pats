package org.scharati.javadespat.singleton2;

/**
 * Singleton Design Pattern
 * 
 */
public class Singleton {

	/**
	 * The instance of Singleton for usage
	 * - Eagerly created
	 */
	static private Singleton instance = new Singleton();
	
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
		return instance;
	}
	

	
}
