package programs;

interface Runnables {
	int speed = 20;

	public void getSpeed();
}

class Anonymous {

	public static void main(String args[]) {
		Runnables obj = new Runnables() {
			int speed = 90;

			@Override
			public void getSpeed() {
				System.out.println("speed=" + this.speed);// for anonymous class this keyword
															// refers to same anonymous class itself.
			}
		};
		obj.getSpeed();
	}

}