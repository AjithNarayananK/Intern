package programs;

import java.io.IOException;

public class ExceptionTest {
	void function() {
		try {
			throw new IOException();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	public static void main(String args[]) {
		ExceptionTest test1 = new ExceptionTest();
		test1.function();
	}

}