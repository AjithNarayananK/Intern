package programs;

import java.util.Date;
import java.util.Scanner;

class Test {
	Date today = new Date();

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String user_pass) {
		password = user_pass;
	}
}

public class EncapsulationTest {
	public static void main(String args[]) {
		Test obj = new Test();
		System.out.println("Enter password");
		Scanner scan = new Scanner(System.in);
		String pass = scan.next();
		obj.setPassword(pass);
		String user_password = obj.getPassword();
		System.out.println("password= " + user_password);
		scan.close();

	}
}