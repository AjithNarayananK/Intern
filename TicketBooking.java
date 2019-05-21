package ticketbooking;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaBooking {
	int[][] Seat = new int[10][10];
	
	Scanner input = new Scanner(System.in);
	
	int[] SeatNo = new int[30];
	int Seats;
	int YesOrNo = 1;
	int SeatCounter = 1;
	String CustomerName;

	void book() {
		while (YesOrNo == 1) {
			System.out.print("Welcome to PVR Cinemas. Enter your name :");
			CustomerName = input.nextLine();

			System.out.print("Welcome " + CustomerName + " select your seats");
			System.out.println();
			for (int i = 1; i <= 80; i++) {
				System.out.print("-");
			}
			System.out.println();

			System.out.print("\t\t\t\t SCREEN THIS SIDE");
			System.out.println();

			for (int j = 1; j <=80; j++) {
				System.out.print("-");
			}
			System.out.println();

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					Seat[i][j] = SeatCounter++;
				}
			}
			SeatCounter = 0;
			show();
		

		for (int k = 1; k <= 80; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("how many seat to book? ");
		int no_of_seats = input.nextInt();
		
		
		for(int seats = 0; seats < no_of_seats ; seats++) {
		System.out.print("select " + (no_of_seats - seats) +" seats");
		Seats = input.nextInt();
		
		
		while (Seats <= 0 || Seats > 100) {
			System.out.println("Only 1 - 100 seats are available, try again: ");
			Seats = input.nextInt();
			if(Seats >0 && Seats <= 100) {
				remove(Seats);
			}
		}
		remove(Seats);
		}
		for (int SeatCounter = 0; SeatCounter < SeatNo.length; SeatCounter++) {
			if (SeatCounter == Seats) {
				System.out.println("Successfully Booked");
				System.out.println("\n Would you like to make next booking? (Type 1 = Yes; Type 2 = No)");
				YesOrNo = input.nextInt();

				if (YesOrNo == 2) {
					System.out.println("Thank you for using this program.");
				}
			}
		}

		while (YesOrNo != 1 && YesOrNo != 2) {
			System.out.println("Invalid input.");
			System.out.println("Type 1 = Continue booking next; \n  Type 2 = Exit Booking");
			YesOrNo = input.nextInt();
		}
	}
	}
	void remove(int booked) {
		for(int x=0;x<10;x++) {
			for(int y=0;y<10;y++) {
				if(Seat[x][y] == booked) {
					Seat[x][y]=00;
				}
			}
		}
	}
	void show() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(Seat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		CinemaBooking pvr = new CinemaBooking();
		pvr.book();
		pvr.show();
	}

}