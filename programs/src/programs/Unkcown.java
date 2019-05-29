package programs;

import java.util.Scanner;

public class Unkcown {
	Scanner scan = new Scanner(System.in);
	static private String name;

	static {
		Unkcown.name = "Stranger";
	}

	static void meet(String RealName) {
		Unkcown.name = RealName;
	}

	void display() {
		System.out.println("Hi " + Unkcown.name + "!");
	}

	void know() {
		String[] array = { "bob", "alice", "jeff", "tony" };
		System.out.println("Enter your name");
		String meet = scan.next();
		for (String i : array) {
			if (i.equals(meet)) {
				Unkcown.meet(meet);
			}
		}
	}

	public static void main(String args[]) {
		Unkcown object = new Unkcown();
		object.know();
		object.display();
	}
}