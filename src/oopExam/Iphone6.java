package oopExam;

public class Iphone6 extends Iphone5 {
	
	/*
	 	Overloading
	---- Overloading allows a class to have more than one method with same name but with different parameter. 
	---- It doesn't support same parameter.
	---- Method Overloading occurs during compile time.

Overriding
--- Overriding is when different methods exist with the same method name with same parameters or signature 
--- But with different syntax or logic
---  Its occurs during run time.
----  It happen when subclass (ConfiguredIphone6 extends Parent class( Iphone6)
	*/

	// void type method
	public void compass() {
		System.out.println("This is void type method of compass from Iphone6 class");
	}
	// Iphone6 is regular class so Iphone6 class extends iphone5 class becasue
	// Regular class only extends abstract class or regular class by extends keyword

	
	// void type method
	public void materials() {
		System.out.println("This is void type method of materials from Iphone6 class");
	}

	// return type parameterized method
	public int materials(int ramPrice, int cameraPrice) {
		int total01 = ramPrice + cameraPrice;
		System.out.println("Total prices of materials are: "+total01);
		return total01;
	}

	// Return type parameterized method
	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int total02 = ramPrice + cameraPrice + Integer.parseInt(processorPrice);
		System.out.println("Total prices of materials are: "+total02);
		return total02;
	}

	// void type parameterized method
	public void materials(int ramPrice, int cameraPrice, String processorPrice, int mousePrice) {
		int total03 = ramPrice + cameraPrice + Integer.parseInt(processorPrice) + mousePrice;
		System.out.println("Total prices of materials are: "+total03);
	}

	// Return type parameterized method
	public int materials(int ramPrice, int cameraPrice, String processorPrice, int mousePrice, int keyboardPric) {
		int total04 = ramPrice + cameraPrice + Integer.parseInt(processorPrice) + mousePrice + keyboardPric;
		System.out.println("Total prices of materials are: "+total04);
		return total04;
	}
	// Static type parameterized method
	public static int materials(int ramPrice, int cameraPrice, String processorPrice, int mousePrice, int keyboardPrice, int monitorPrice) {
		int total05 = ramPrice + cameraPrice + Integer.parseInt(processorPrice) + mousePrice + keyboardPrice
				+ monitorPrice;
		System.out.println("Total prices of materials are: "+total05);
		return total05;
	}
	// Final type parameterized method
	public final int materials(int ramPrice, int cameraPrice, int mousePrice, int keyboardPrice, int monitorPrice) {
	 int total06 = ramPrice + cameraPrice + mousePrice + keyboardPrice+ monitorPrice;
	 System.out.println("Total prices of materials are: "+total06);
	 return total06;

	}
	}


