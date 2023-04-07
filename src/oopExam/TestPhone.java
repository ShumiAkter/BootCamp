package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println("\n************..............*Regular class Of Iphone1 class*...................******************\n");
		Iphone1 iphone1 = new Iphone1();
		iphone1.regularClassInfo();
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.cemera();
		iphone1.watch();
		iphone1.appleWatchInfo();
		iphone1.digitalWatch();
		iphone1.pager();
		iphone1.wakitoki();
		iphone1.setPrice(750);
		iphone1.setInfo("2000");
		iphone1.getSex();
		iphone1.setMadeInUSA(false);
		System.out.println("I bought this phone in " + iphone1.getInfo() + ".\nThe price was $" + iphone1.getPrice()
				+ "\nUser's sex: " + iphone1.getSex() + "\nIS the Iphone made in USA : " + iphone1.isMadeInUSA());
		iphone1.youtube();

		System.out.println("\n...................................{*Abstract class*}..........................................\n");
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		appleWatch.appleWatchSeries5();
		appleWatch.watch();
		appleWatch.digitalWatch();

		System.out.println("\n...................................{*Interface Class*}..........................................\n");
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.cemera();
		Phone.battery();
		phone.wireless();
		phone.pager();
		phone.wakitoki();

		/*
		 * This is Multi_Level Inheritance because iphone2 extends Iphone1, Iphone1
		 * extends AppleWatch and implements Phone. Phone extends Pager and Wakitoki.
		 */
		System.out.println("\n...................................{*Regular Class of Iphone 2*}..........................................\n");
		Iphone2 iphone2 = new Iphone2();
		Iphone2 iphon = new Iphone2('F');
		iphone2.iPhone2Info();
		iphone2.iPhone2Info('F');
		iphone2.regularClassInfo();
		iphone2.youtube();
		iphone2.dropbox();

		// Here iphone3 is single Inheritance because Iphone3 extends iphone1( map
		// method come fromIphone3 class)
		System.out.println("\n...................................{*Regular Class of Iphone 3*}..........................................\n");
		Iphone3 iphone3 = new Iphone3();
		iphone3.map();

		System.out.println("\n...................................{*Regular Class of Iphone 4*}..........................................\n");
		Iphone4 iphone4 = new Iphone4();
		iphone4.photos();

		System.out.println("\n...................................{*Regular Class of Iphone 5*}..........................................\n");
		Iphone5 iphone5 = new Iphone5();
		iphone5.email();

		System.out.println("\n...................................{*Regular Class of Iphone 6*}..........................................\n");
		Iphone6 iphone6 = new Iphone6();
		iphone6.compass();
		iphone6.materials();
		iphone6.materials(100, 800);
		iphone6.materials(100, 800, "400");
		iphone6.materials(100, 800, "400", 10);
		iphone6.materials(100, 800, "400", 10, 90);
		Iphone6.materials(100, 800, "400", 10, 90, 850);
		iphone6.materials(100, 800, 10, 90, 850);

		System.out.println("\n...................................{*Regular Class of ConfiguredIphone6 *}..........................................\n");
		ConfiguredIphone6 configuredIphone6 = new ConfiguredIphone6();
		configuredIphone6.compass();
		configuredIphone6.materials();
		configuredIphone6.materials(100, 800);
		configuredIphone6.materials(100, 800, "400");
		configuredIphone6.materials(100, 800, "400", 10);
		configuredIphone6.materials(100, 800, "400", 10, 90);
		

		// Example from Hierarchical Inheritance are Iphone2 extends Iphone1, Iphone3
		// extends Iphone1.


	}

}
