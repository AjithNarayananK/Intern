package programs;

interface Animal {
	public int legs();

	public int tail();

	public String sound();
}

class Catt implements Animal {
	public int legs() {
		int No_of_Legs = 4;
		return No_of_Legs;
	}

	public int tail() {
		int No_of_tail = 1;
		return No_of_tail;
	}

	public String sound() {
		return "meow";
	}
}

class Dogg implements Animal {
	public int legs() {
		int No_of_Legs = 4;
		return No_of_Legs;
	}

	public int tail() {
		int No_of_tail = 1;
		return No_of_tail;
	}

	public String sound() {
		return "woof";
	}
}

public class CatFamily {
	public static void main(String args[]) {
		Animal obj = new Dogg();
		Animal obj1 = new Catt();
		System.out.println("no. of legs for dogs =" + obj.legs());
		System.out.println("no. of tail for dogs =" + obj.tail());
		System.out.println("sound of dogs =" + obj.sound());
		System.out.println("no. of legs for cats =" + obj1.tail());
		System.out.println("no. of tail for cats =" + obj1.legs());
		System.out.println("sound of cats =" + obj1.sound());
	}
}