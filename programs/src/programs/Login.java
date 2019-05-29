package programs;

import java.util.Scanner;

public class Login {
	Scanner scan = new Scanner(System.in);
	final int DOB = 20081997;
	final String Security_Answer = "Scooby";
	boolean result;

	void perform() {
		System.out.println("press 1 for login using Date Of Birth");
		System.out.println("Press 2 for login using Security Question");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Date of Birth inthe format (DDMMYYYY) ");
			int dob = scan.nextInt();
			result = Login(dob);
			if (result) {
				System.out.println("Login Successful");
			} else {
				System.out.println("Login Failed");
			}
			break;
		case 2:
			System.out.println("Enter your pet's name");
			String User_Answer = scan.next();
			result = Login(User_Answer);
			if (result) {
				System.out.println("Login Successful");
			} else {
				System.out.println("Login Failed");
			}
			break;
		default:
			System.out.println("Enter 1 or 2");
			break;
		}

	}

	boolean Login(int dob) {
		if (dob == DOB) {
			return true;
		} else {
			return false;
		}
	}

	boolean Login(String Security_Question) {

		if (Security_Question.equals(Security_Answer)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Login obj = new Login();
		obj.perform();
	}
}