package programs;

abstract class Abstract {
	public int legs() {
		int No_of_Legs = 4;
		return No_of_Legs;
	}

	public int tail() {
		int No_of_tail = 1;
		return No_of_tail;
	}

	abstract public String sound();
}

class Cat extends Abstract {	
	
	public String sound() {
		return "meow";
	}
}

class Dogs extends Abstract {
	public String sound() {
		return "woof";
	}
}

public class Main {
	public static void main(String args[]) {
		Abstract ref = new Cat();

		System.out.println(ref.sound());
		Abstract ref1 = new Dogs();
		System.out.println(ref1.sound());
	}
}