package oopExam;

public class Iphone2 extends Iphone1 {
	
	//initiliazed variable
	public char userOfIphone = 'F';
	
	//Default constructor
	public Iphone2() {
		super();
		super.regularClassInfo();
		super.youtube();
		super.name = "Shumi Akter";
		System.out.println("My name is: " +name);
		System.out.println("This is a default constractor from Iphone2 class");
	}
	//parameterized constructor
	public Iphone2(char userOfIphone) {
		this.userOfIphone = userOfIphone;
		
		super.regularClassInfo();
		super.name = "Shumi Akter";
		System.out.println("My name is: " +name);
		super.youtube();
		System.out.println("This is a default constractor from Iphone2 class");
	}
	//void type method
	public void iPhone2Info() {
		
		super.regularClassInfo();
		System.out.println("This is a default void type method from Iphone2 class");		
		super.name = "Shumi Akter";
		System.out.println("My name is: " +name);
		super.youtube();
	}
	//Parameterized method
	public void iPhone2Info(char userOfIphone) {
		this.userOfIphone = userOfIphone;
		super.regularClassInfo();
		super.youtube();
		super.name = "Shumi Akter";
		System.out.println("My name is: " +name);	
	}
	//void type method
	public void dropbox() {
		System.out.println("This is void type  method from dropbox.");
		
	}
	
}
