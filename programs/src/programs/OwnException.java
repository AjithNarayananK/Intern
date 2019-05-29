package programs;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class OwnException {
	public static void main(String args[]) {
		try {
			throw new MyException("exeptiom occured");
		} catch (MyException ex) {
			System.out.println("Caught" + ex);

			System.out.println(ex);
		}
	}
}