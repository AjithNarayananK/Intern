package programs;

class Base {
	protected void show() {
		System.out.println("base show");
	}
}

class Derived extends Base {
	@Override
	protected void show() {
		super.show(); // visibility of the Inherited method cannot reduce
		System.out.println("derived show");
	}
}

public class ProtectedAccess {

	public static void main(String args[]) {
		Derived fer = new Derived();
		fer.show();
	}
}
