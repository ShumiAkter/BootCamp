package oopExam;

//Relationship between Regular class, Abstract class and Interface class: 
//Regular class (Iphone) extends Abstract class (Applee Watch) and implement Interface Phone.
public class Iphone1 extends AppleWatch implements Phone {
	
	//private variables
	private int price;
	private String info;
	private char sex;
	private boolean madeInUSA;
	
	//public variable
	public String name;
	
	
	//Getters and Setters method
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}
	//Default constructor 
	public Iphone1() {
		System.out.println("This is from the default Constructor of Iphone1 class");
	}
	//Parameterized constructor 
	public Iphone1(int price, String info, char sex, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.sex = sex;
		this.madeInUSA = madeInUSA;
		System.out.println("This is from the parameterized Constructor of Iphone class");
	}
	//void type method
	public void regularClassInfo() {
		System.out.println(
				"Regular class, Abstract class and Interface class are names start with UpperCase and they follow the Camel case and Snake."
						+ "\n-- Regular class and Abstract class: they both have declared and initialized variables. Only Interface class variables are initialized and it final. "
						+ "\n-- Regular class, Abstract class both have constructor but Interface class can't have constructor. However later it have constructor by helping other constructor name\n"
						+ "-- Regular class, Abstract class support  implement method, \n"
						+ "-- Regular class, Abstract class support and Interface class they support static type method\n"
						+ "-- Regular class, Abstract class support don't support Default type method\n"
						+ "-- Regular method don'tsupport abstract method\n"
						+ "-- Regular class can inherit one regular or abstract class by Extends keywords\n"
						+ "-- can't inherit interface class by extends keywords\n"
						+ "-- can inherit more than one interfaces by Implement keywords.");
	}
	//void type method
	public void youtube() {
		System.out.println("YouTube is a free video sharing website that makes it easy to watch online videos. You can even create and upload your own videos to share with others.");
		
	}

	@Override
	public void pager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wakitoki() {
		// TODO Auto-generated method stub
	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub
	}

	@Override
	public void digitalWatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cemera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	
}
