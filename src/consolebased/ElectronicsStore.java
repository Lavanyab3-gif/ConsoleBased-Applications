package consolebased;

import java.util.Scanner;

public class ElectronicsStore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("*** Welcome to Lavanya's Electronics Store ***");

		double mblPrice = 0.0;

		double lapPrice = 0.0;

		double camPrice = 0.0;

		double hmPrice = 0.0;

		double gmngPrice = 0.0;

		System.out.println("1.mobile");

		System.out.println("2.Laptop");

		System.out.println("3.Camera");

		System.out.println("4.Home Needs");

		System.out.println("5.Gaming");

		System.out.println("Enter the Category:");

		String catg = sc.next();

		String yn = "";

		do {

			switch (catg) { 

			case "mbl" -> {

				String myn = "";

				do {

					System.out.println("Enter the Item:");

					String item = sc.next();

					switch (item) {

					case "vivo" -> {

						System.out.println("The Price of Vivo phone is 20000/-");

						double vPrice = 20000.0;

						mblPrice = mblPrice + vPrice;

					}
					case "iphone" -> {

						System.out.println("The Price of iPhone is 75000/-");

						double iphPrice = 75000.0;

						mblPrice = mblPrice + iphPrice;

					}
					case "one+" -> {

						System.out.println("The price of OnePlus phone is 25000/-");

						double oneplsPrice = 25000.0;

						mblPrice = oneplsPrice + mblPrice;

					}

					case "mi" -> {

						System.out.println("Enter the Price of the  Redmi phonr is 15000/-");

						double miPrice = 15000.0;

						mblPrice = miPrice + mblPrice;

					}
					default -> System.out.println(" The required  Mobile is not available right now !! ");

					}

					System.out.println("Do u want to continue click Y otherwise click N ");

					myn = sc.next();

				} while (myn.equalsIgnoreCase("y"));

				System.out.println("Exit from Mobile Category!!");

				System.out.println("Total Price of mobile is :" + mblPrice);

			}

			case "lap" -> {
				String lyn = "";
				do {
					System.out.println("Enter the item:");

					String item = sc.next();

					switch (item) {

					case "hp" -> {

						System.out.println("The Price of HP laptop is 55000");

						double hpPrice = 55000.0;

						lapPrice = lapPrice + hpPrice;
					}
					case "dell" -> {

						System.out.println("The Price of Dell laptop is 60000");

						double dellPrice = 60000.0;

						lapPrice = lapPrice + dellPrice;

					}

					case "lenovo" -> {

						System.out.println("The Price of Lenovo laptop is 50000");

						double lenovoPrice = 50000.0;

						lapPrice = lapPrice + lenovoPrice;

					}

					case "asus" -> {

						System.out.println("The Price of Asus laptop is 65000");

						double asusPrice = 65000.0;

						lapPrice = lapPrice + asusPrice;

					}

					case "acer" -> {

						System.out.println("The Price of Acer laptop is 45000");

						double acerPrice = 45000.0;

						lapPrice = lapPrice + acerPrice;

					}

					default -> System.out.println("The Required laptop is not Available here");

					}

					System.out.println("Do you want to continue with Laptops..??");

					lyn = sc.next();

				} while (lyn.equalsIgnoreCase("Y"));

				System.out.println("Exit from the Laptops");

				System.out.println("Total Laptops Price is:" + lapPrice);

			}

			case "cam" -> {

				String cyn = "";

				do {

					System.out.println("Enter a Item:");

					String item = sc.next();

					switch (item) {

					case "cc" -> {
						System.out.println("The Price of CCTV Camera is 3000/-");

						double ccPrice = 3000.0;

						camPrice = camPrice + ccPrice;

					}

					case "dslr" -> {
						System.out.println("The Price of DSLR Camera is 60,000");

						double dlsrPrice = 60000.0;

						camPrice = camPrice + dlsrPrice;
					}

					case "mrrlss" -> {
						System.out.println("The Price of MirrirLess Camera is 75,000");

						double mlPrice = 75000.0;

						camPrice = camPrice + mlPrice;
					}

					case "dgtl" -> {
						System.out.println("The Price of Digital Camera is 25000");

						double dgtlPrice = 25000.0;

						camPrice = camPrice + dgtlPrice;
					}

					default -> System.out.println("The requires Item is not availabe here..!!");

					}

					System.out.println("Do You want to Continue enter y otherwise enter n");

					cyn = sc.next();

				} while (cyn.equalsIgnoreCase("y"));

				System.out.println("Exit from the camera..!!");

				System.out.println("Total Price of Camera is:" + camPrice);

			}
			case "home" -> {

				String hyn = "";

				do {

					System.out.println("Enter a Item :");

					String item = sc.next();

					switch (item) {

					case "wm" -> {
						System.out.println("The Price of Washing Machine is 30,000/-");

						double wmPrice = 30000.0;

						hmPrice = hmPrice + hmPrice;
					}
					case "ref" -> {

						System.out.println("The Price of Refrigerator is 35,000/-");

						double refPrice = 35000.0;

						hmPrice = hmPrice + refPrice;

					}

					case "mw" -> {

						System.out.println("The Price of Microwave Oven is 12,000/-");

						double mwPrice = 12000.0;

						hmPrice = hmPrice + mwPrice;

					}

					case "ac" -> {

						System.out.println("The Price of Air Conditioner is 40,000/-");

						double acPrice = 40000.0;

						hmPrice = hmPrice + acPrice;

					}

					case "clrr" -> {

						System.out.println("The Price of Air Cooler is 10,000/-");

						double clrPrice = 10000.0;

						hmPrice = hmPrice + clrPrice;

					}

					case "vc" -> {

						System.out.println("The Price of Vacuum Cleaner is 8,000/-");

						double vcPrice = 8000.0;

						hmPrice = hmPrice + vcPrice;

					}

					default -> System.out.println("Entered Item is not Available now!!");

					}
					System.out.println("Do You want to continue enter y otherwise enter n");

					hyn = sc.next();
				} while (hyn.equalsIgnoreCase("y"));

				System.out.println("Exit from the camera!!");

				System.out.println("Price of HomeNeeds is:" + hmPrice);

			}

			case "gmng" -> {

				String gyn = "";

				do {

					System.out.println("Enter the item :");

					String item = sc.next();

					switch (item) {

					case "ply" -> {

						System.out.println("The Price of PlayStation is 50,000");

						double plyPrice = 50000.0;

						gmngPrice = gmngPrice + plyPrice;

					}
					case "xbox" -> {

						System.out.println("The Price of Xbox is 45,000/-");

						double xboxPrice = 45000.0;

						gmngPrice = gmngPrice + xboxPrice;

					}

					case "gmouse" -> {

						System.out.println("The Price of Gaming Mouse is 2,000/-");

						double gmousePrice = 2000.0;

						gmngPrice = gmngPrice + gmousePrice;

					}

					case "gkey" -> {

						System.out.println("The Price of Gaming Keyboard is 3,000/-");

						double gkeyPrice = 3000.0;

						gmngPrice = gmngPrice + gkeyPrice;

					}

					case "gheadset" -> {

						System.out.println("The Price of Gaming Headset is 2,500/-");

						double gheadsetPrice = 2500.0;

						gmngPrice = gmngPrice + gheadsetPrice;

					}

					case "controller" -> {

						System.out.println("The Price of Gaming Controller is 5,000/-");

						double controllerPrice = 5000.0;

						gmngPrice = gmngPrice + controllerPrice;

					}

					default -> System.out.println("The required item is not Available");

					}

					System.out.println("Do you want to continue enter Y otherwise enter N");

					gyn = sc.next();

				} while (gyn.equalsIgnoreCase("y"));

				System.out.println("Exit from the Gamming ");

				System.out.println(" The total Price is " + gmngPrice);

			}
			}
		}while (yn.equalsIgnoreCase("y"));
		
		System.out.println("Total Price is:" + (mblPrice + lapPrice + camPrice+hmPrice+gmngPrice));
		
		System.out.println("Thankyou for visiting...!!");
		System.out.println("Visit Again to our Store ...");

	}
}
