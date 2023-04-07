package oopExam;

/* 
 In Interface class, variablesare only initialized and it's final. Can’t change. Doesn't have default variables
 -- Interface can't have constructor
 --  it contains only abstract method
 -- support static and default type method
 -- Interface can't inherit a regular class or an abstract class by Extends keywords
 -- An interface can inherit more than one Interface (separate by comma) by Extends Keyword
 -- Interface Class can't inherit  interface class by implementing keywords
 */
public interface Phone extends Pager, Wakitoki {

	public int age = 63;

	/*
	  public Phone() {} Interface can't have constructor
	 */
	public void interfaceInfo();

	public abstract void call();

	public void message();

	public void cemera();

	// An Interface class can't support non abstract (implement) method. However it
	// only support static and default type method
	
	public static void battery() {	//static type method
		System.out.println("Battery is a static type method");
	}
	//Default type method
	public default void wireless() {
		System.out.println("Wireless is default type method");		//default type method
	}
}
