package consolebased;
import java.util.Scanner;

class Atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        char again;

        do {
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance = " + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                int amount = sc.nextInt();

                balance = balance + amount;

                System.out.println("Balance = " + balance);
            }
            else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                int amount = sc.nextInt();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Remaining Balance = " + balance);
                }
                else {
                    System.out.println("Insufficient Balance");
                }
            }
            else {
                System.out.println("Invalid Choice");
            }

            System.out.print("Do you want any other operation!! (yes/no): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("Thank you for vising....");

        
    }
}