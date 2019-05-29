package programs;

interface Runnable {

	public void run();

	public void speed();

	public void rest();
}

class Cats implements Runnable {
	public void speed() {
		System.out.println("Maximum speed of cat is " + 8 + "km/hr");
	}

	public void rest() {
		System.out.println("Dog takes rest for " + 9 + "hrs/day");
	}

	public void run() {
		System.out.println("Dog runs avragely for " + 10 + " Minutes");
	}
}

public class Dog implements Runnable {
	public void speed() {
		System.out.println("Maximum speed of Dog is " + 10 + "km/hr");
	}

	public void rest() {
		System.out.println("Dog takes rest for " + 7 + "hrs/day");
	}

	public void run() {
		System.out.println("Dog runs avragely for " + 30 + " Minutes");
	}

	public static void main(String args[]) {
		Dog scooby = new Dog();
		scooby.speed();
		scooby.rest();
		scooby.run();

		Cats charles = new Cats();
		charles.speed();
		charles.run();
		charles.rest();

	}
}