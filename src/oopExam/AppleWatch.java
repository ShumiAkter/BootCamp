package oopExam;

/*
 *Abstract class have declared and initialized variablesare
 -- it have constructor
 -- have abstract and implement method
 -- support static method
 -- this is mandotory to write at least one abstract keyword with abstract method inside abstract class.
 -- Abstract class can inherit only one abstract class or one regular class by Extends keywords
 -- can't inherit a regular class or abstract class by implements keywords
 -- can inherit only interface by implements keywords
 */

// Yes we can make relationship of AppleWatch with Watch, DigitalWatch by implements keywords
// and make relationship of AppleWatch with AppleWatchSeries5 by extends keywords

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {	
//Yes we can create a variable and constructor inside Abstract Class and can you instantiate it
  public String name ="Shumi A";	//variable anitialized
  public int age; // default variable
	
	public AppleWatch() {	// constructor
		
	}
	public void abstractClassInfo() {	//non Abstract method
	}
	public abstract void appleWatchInfo(); 	//Abstract method

}
