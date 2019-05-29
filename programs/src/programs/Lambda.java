package programs;

import java.util.Scanner;

interface Runable {
	public void run(double time, float distance);

	default void method() {
		System.out.println("Inside defaut method");

	}

}

public class Lambda {

	Scanner scan = new Scanner(System.in);

	public void run(double timing, float dist) {
		double speeds = dist / timing;
		System.out.println("speed= " + speeds);

	}

	public static void main(String[] args) {
		Runable runable = (double time, float distance) -> {
			System.out.println("speed =" + distance / time);
		};
		Runable runrun = (double time, float distance) -> {
			System.out.println("speed=" + distance / time);
		};
		runable.run(12.5, 25);
		runable.method();
		runrun.run(23, 60);
	}
}