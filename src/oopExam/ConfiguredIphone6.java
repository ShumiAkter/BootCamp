package oopExam;

public class ConfiguredIphone6 extends Iphone6 {
	
	@Override
	// void type method
	public void compass() {
		System.out.println("This is void type method of compass from Iphone6 class");
	}

	@Override
	// void type method
	public void materials() {
		System.out.println("This is void type method of materials from Iphone6 class");
	}

	@Override
	// return type parameterized method
	public int materials(int ramPrice, int cameraPrice) {
		int total01 = ramPrice + cameraPrice+8;
		System.out.println("Total prices of materials are: " + total01);
		return total01;
	}

	@Override
	// Return type parameterized method
	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int total02 = 2*ramPrice + cameraPrice + Integer.parseInt(processorPrice);
		System.out.println("Total prices of materials are: " + total02);
		return total02;
	}

	@Override
	// void type parameterized method
	public void materials(int ramPrice, int cameraPrice, String processorPrice, int mousePrice) {
		int total03 = ramPrice + 10+cameraPrice + Integer.parseInt(processorPrice) + mousePrice;
		System.out.println("Total prices of materials are: " + total03);
	}

	@Override
	// Return type parameterized method
	public int materials(int ramPrice, int cameraPrice, String processorPrice, int mousePrice, int keyboardPric) {
		int total04 = 5-ramPrice + cameraPrice + Integer.parseInt(processorPrice) + mousePrice + 20+keyboardPric;
		System.out.println("Total prices of materials are: " + total04);
		return total04;
	}
	/*
	  // Static type parameterized method //static method can'possible Overridden.
	  // It support overload.
	  
	  //@Override 
	public static int materials(int ramPrice, int cameraPrice, String processorPrice, int mousePrice, int keyboardPrice, int monitorPrice) {
		int total05 = ramPrice + cameraPrice + Integer.parseInt(processorPrice) +mousePrice + keyboardPrice + monitorPrice;
	  System.out.println("Total prices of materials are: "+total05); 
	  return total05;
	}
	  	  
	 ///Final type parameterized method
	//Final type method can't be Overridden because it already final by itself
	  
	//  @Override 
	  public final int materials(int ramPrice, int cameraPrice, int mousePrice, int keyboardPrice, int monitorPrice) {
		  int total06 = ramPrice +cameraPrice + mousePrice + keyboardPrice+ monitorPrice;
	  System.out.println("Total prices of materials are: "+total06); return
	  total06; }
	  
	 */ 
}
