import java.util.Scanner;

public class TicketBook {
	Scanner scan = new Scanner(System.in);
	boolean Array[][] = new boolean[10][10];
	final int Total_Tickets = 100;
	
	void show() {
	
		for (char x = 'J'; x >= 'A'; x--) {
			for (int y = 0; y < 10; y++) {
				
				System.out.print(x);
				System.out.print(y + 1 + " ");
			}
			System.out.println();
		}
		System.out.println("  ------ Screen this way------");
		System.out.println("\n");
	}
	void book() {
		System.out.println("Enter the number of tickets: ");
		int no_of_tickets = scan.nextInt();
		if(no_of_tickets > 10) {
			System.out.println("-------Maximum 10 tickets can be booked !!! -------");
		}
		if(no_of_tickets > Total_Tickets) {
			System.out.print(no_of_tickets + " Tickets Not available");
		}
		
		else {
			System.out.println();
			String[] arr = new String[10];
			for(int i=0;i<no_of_tickets;i++) {
				arr[i] = scan.next();
			}
		}
	}
	public static void main(String[] args) {
			TicketBook PVR = new TicketBook();
			PVR.show();
			PVR.book();
	}
}
