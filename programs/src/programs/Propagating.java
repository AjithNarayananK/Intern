package programs;

class Propagating {
	void method3() {
		throw new ArithmeticException();
	}

	void method2() {
		System.out.println("inside 2nd function");
		method3();

	}

	void method1() {
		try {
			System.out.println("inside 1st function");
			method2();
		} catch (Exception e) {
			System.out.println("Exception done");
		}
	}

	public static void main(String args[]) {
		Propagating obj = new Propagating();
		obj.method1();
		System.out.println("over");
	}
}