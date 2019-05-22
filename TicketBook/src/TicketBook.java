import java.time.LocalDate;
import java.util.Scanner;

public class TicketBook {
	LocalDate localDate = LocalDate.now();
	static int ContinueOrNot = 1;
	int k, l;
	Scanner scan = new Scanner(System.in);
	boolean seats[][] = new boolean[10][10];

	void show() {

		for (char c = 'J'; c >= 'A'; c--) {
			for (int j = 0; j < 10; j++) {
				if (seats[c - 'A'][j] == false) {
					System.out.print(c);
					System.out.print((j + 1) + "\t");
				} else {
					System.out.print("N/A\t");
				}
			}
			System.out.println();
		}
		System.out.println("    \t\t********************************");
		System.out.println("    \t\t\tSCREEN THIS SIDE\t\t\t");
		System.out.println("    \t\t********************************");
	}

	void book() {

		System.out.println("Enter the number of tickets: ");
		int no_of_tickets = scan.nextInt();
		if (no_of_tickets > 10) {
			System.out.println("Maximum 10 tickets can be booked.");
			while (no_of_tickets > 10) {
				System.out.println("Enter the number of tickets: ");
				no_of_tickets = scan.nextInt();
			}
		}
		for (int g = 0; g < no_of_tickets; g++) {
			System.out.println("for ticket number:" + (g + 1));
			System.out.println("Enter the row: A to J :");
			char row = scan.next().charAt(0);
			while (row > 'J' || row < 'A') {
				System.out.println("Enter VALID row: A to J :");
				row = scan.next().charAt(0);
			}

			System.out.println("Enter the column : 1 to 10 : ");
			int column = scan.nextInt();
			while (column > 10 || column < 1) {
				System.out.println("Enter VALID column: 1 to 10 :");
				column = scan.nextInt();
			}
			int u = row - 'A';

			boolean result = check(u, column - 1);

			if (result == true) {
				System.out.println("It is already booked !");
				System.out.println();
			} else {
				seats[u][column - 1] = true;
				System.out.println("Your tickets are booked !");
				System.out.println();
			}
		}
	}

	boolean check(int k, int l) {
		if (seats[k][l] == true) {
			return true;
		} else {
			return false;
		}
	}

	int continueornot() {
		ContinueOrNot = scan.nextInt();
		switch (ContinueOrNot) {
		case 1:
			ContinueOrNot = 1;
			break;
		case 2:
			ContinueOrNot = 2;
			break;
		default:
			System.out.println("Enter valid number");
			while (ContinueOrNot != 1 || ContinueOrNot != 2) {
				System.out.println("Enter valid Option");
				ContinueOrNot = scan.nextInt();
			}
		}
		return ContinueOrNot;
	}

	public static void main(String[] args) {
		TicketBook PVR = new TicketBook();
		long d = 10999499432943456L;
		int i = (int) d;

		System.out.println("Integer value: " + i);

		do {
			PVR.show();
			PVR.book();
			PVR.show();
			System.out.println("Do you want to continue ?/n/n press 1 to continue /n/n press 2 to exit/n/n");
			ContinueOrNot = PVR.continueornot();

		} while (ContinueOrNot == 1);
	}
}