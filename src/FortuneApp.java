import java.util.Scanner;

public class FortuneApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name");
		String firstNameRaw = input.nextLine();
		if (firstNameRaw.equalsIgnoreCase("Quit")) {
			System.out.println("It's okay, everyone is busy");
			System.exit(0);
		}

		System.out.println("Enter your last name");
		String lastNameRaw = input.nextLine();
		if (lastNameRaw.equalsIgnoreCase("Quit")) {
			System.out.println("It's okay, everyone is busy");
			System.exit(0);
		}

		String firstName = printCapitalizedVersion(firstNameRaw);
		String lastName = printCapitalizedVersion(lastNameRaw);

		String retirement = "0";
		String vacation = "0";
		String ride = "0";
		String balance = "0";

		System.out.println("Enter your age");
		String ageString = input.nextLine();
		
		if (ageString.equalsIgnoreCase("Quit")) {
			System.out.println("It's okay, everyone is busy");
			System.exit(0);
		}
		
		int age = Integer.parseInt(ageString);
		
		System.out.println("Enter your birth month (1-12)");
		String monthString = input.nextLine();
		
		if (monthString.equalsIgnoreCase("Quit")) {
			System.out.println("It's okay, everyone is busy");
			System.exit(0);
		}
		
		int month = Integer.parseInt(monthString);


		System.out.println("Enter your favorite ROYGBIV color");
		System.out.println("\t*type \"Help\" to get list of ROYGBIV colors");
		String favColor = input.nextLine();
		
		while (favColor.equalsIgnoreCase("help")) {
			System.out.println("Your choices are Red, Orange, Yellow, Green, Blue, Indigo, and Violet");
			System.out.println("Now, enter your favorite ROYGBIV color");
			favColor = input.nextLine();
		}
		
		if (favColor.equalsIgnoreCase("Quit")) { 
			System.out.println("It's okay, everyone is busy");
			System.exit(0);
		}

		System.out.println("Enter your number of siblings");
		String siblingsString = input.nextLine();

		if (siblingsString.equalsIgnoreCase("Quit")) {
			System.out.println("It's okay, everyone is busy");
			System.exit(0);
		}
		
		int siblings = Integer.parseInt(siblingsString);

		if (age % 2 == 1) {
			retirement = "90 years";
		} else {
			retirement = "85 years";
		}

		if (siblings == 0) {
			vacation = "Taiwan";
		} else if (siblings == 1) {
			vacation = "China";
		} else if (siblings == 2) {
			vacation = "Japan";
		} else if (siblings == 3) {
			vacation = "South Korea";
		} else if (siblings > 3) {
			vacation = "France";
		} else {
			vacation = "North Korea";
		}

		if (favColor.equalsIgnoreCase("red")) {
			ride = "Magic Carpet";
		} else if (favColor.equalsIgnoreCase("Orange")) {
			ride = "Sunbeam";
		} else if (favColor.equalsIgnoreCase("yellow")) {
			ride = "Smart Car";
		} else if (favColor.equalsIgnoreCase("green")) {
			ride = "Prius";
		} else if (favColor.equalsIgnoreCase("Blue")) {
			ride = "Jet Ski";
		} else if (favColor.equalsIgnoreCase("Indigo")) {
			ride = "Jet";
		} else if (favColor.equalsIgnoreCase("Violet")) {
			ride = "Horse";
		} else {
			ride = "Dictionary";
		}

		if ((month >= 1) && (month <= 4)) {
			balance = "$5,000,000";
		} else if ((month >= 5) && (month <= 8)) {
			balance = "$10,000,000";
		} else if ((month >= 9) && (month <= 12)) {
			balance = "$1,000";
		} else {
			balance = "$0.00";
		}

		System.out.println(firstName + " " + lastName + " will retire in " + retirement + " with " + balance
				+ " in the bank, a vacation home in " + vacation + ", and travel by " + ride + ".");

	}

	private static String printCapitalizedVersion(String message) {
		return (message.substring(0, 1).toUpperCase() + message.substring(1).toLowerCase());
	}

}
