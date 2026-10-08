package consolebased;

import java.util.Scanner;

public class Restaurant {
	Scanner sc = new Scanner(System.in);

	int location() { 
		System.out.println("1.Hyderabad");
		System.out.println("2.Vizianagaram");
		System.out.println("3.Vishakapatnam");
		System.out.println("4.Srikakulam");
		System.out.println("5.kukatpally");
		System.out.println("Enter the location:");
		return sc.nextInt();
	}

	int restaurant(int location) {
		if (location == 1) {
			System.out.println("1.Bawarchi");
			System.out.println("2.Mehfil");
			System.out.println("3.Pista House");
			System.out.println("4.venkatradri Vantillu");
			System.out.println("5.Paradise");
		} else if (location == 2) {
			System.out.println("1.MFC");
			System.out.println("2.NFC");
			System.out.println("3.DFC");
			System.out.println("4.Rajugari vantillu");
			System.out.println("5.Food court");
		} else if (location == 3) {

			System.out.println("1.Mayuri");
			System.out.println("2.Grand");
			System.out.println("3.mandi");
			System.out.println("4.Babai Vantillu");
			System.out.println("5.Food world");
		} else if (location == 4) {
			System.out.println("1.SVD");
			System.out.println("2.Dawat");
			System.out.println("3.Dabha");
			System.out.println("4.Sikkollu vantillu");
			System.out.println("5.Telugu Ruchulu");
		} else if (location == 5) {
			System.out.println("1.Btech wala biryani");
			System.out.println("2.Mana vantalu");
			System.out.println("3.Blue Earth");
			System.out.println("4.Dolphin");
			System.out.println("5.Spicy Kitchen");
		}
		System.out.println("Enter the choice:");
		return sc.nextInt();
	}

	double item(int location, int restaurant) {

		System.out.println("1.Biryani --> 300/-");
		System.out.println("2.Chiken 65 --> 250/-");
		System.out.println("3.Special Biryani --> 350/-");
		System.out.println("4.Panneer --> 280/-");
		System.out.println("5.Manchuria --> 150/-");

		System.out.print("Enter Item: ");
		int item = sc.nextInt();

		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();

		double price = 0;
		if (item == 1) {
			price = 300;
		} else if (item == 2) {
			price = 250;
		} else if (item == 3) {
			price = 350;
		} else if (item == 4) {
			price = 280;
		} else if (item == 5) {
			price = 150;
		}
		return price * quantity;
	}

	void billing(double total) {
		double discount;
		if (total >= 1000)
			discount = total * 20 / 100;
		else if (total >= 500)
			discount = total * 10 / 100;
		else
			discount = 0;
		double finalAmount = total - discount;

		System.out.println("Total Amount = Rs." + total);
		System.out.println("Discount = Rs." + discount);
		System.out.println("Final Amount = Rs." + finalAmount);

	}

	public static void main(String[] args) {
		Restaurant r = new Restaurant();
		int loc = r.location();
		int res = r.restaurant(loc);
		double total = r.item(loc, res);
		r.billing(total);

	}

}
