package consolebased;

import java.util.Scanner;

public class JobPortal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Qualifiation:");
		String qualification = sc.nextLine();
		if (qualification.equals("BTech") || qualification.equals("Degree")) {
			System.out.println("Your Qualification matches to this job ");
			System.out.println("Enter Backlogs:");
			int backlog = sc.nextInt();
			if (backlog == 0) {
				System.out.println("Go to next step");
				System.out.println("Enter Graduation Year:");
				long graduationYear = sc.nextLong();
				if (graduationYear == 2025 || graduationYear == 2026) {
					System.out.println("Okay!! You are moving to another step");
					System.out.println("Enter Ovrerall Eduction Percentage:");
					int percentage = sc.nextInt();
					sc.nextLine();
					if (percentage >= 65) {
						System.out.println("Ok with Your percentage");
						System.out.println("Enter Skills:");
						String skills = sc.nextLine();
						if (skills.equals("Java") || skills.equals("SQL")) {
							System.out.println("Your skills are matched");
							System.out.println("Enter experience:");
							int expinmon = sc.nextInt();
							if (expinmon <= 12) {
								System.out.println("You are eligible");
							} else {
								System.out.println("Not Eligible");
							}

						} else {
							System.out.println("Your skills are not matched to this position!!");
						}

					} else {
						System.out.println("Your percentage is not matched");
					}
				} else {
					System.out.println("Not Eligible to apply");
				}
			}

			else {
				System.out.println("Having Backlogs candidates are allowed,You have to clear...");
			}
		} else {
			System.out.println("Your Qualification should not match ");

		}
		System.out.println("Ok...Congratulations!! You are Eligible to apply for this position!!");

	}

}
