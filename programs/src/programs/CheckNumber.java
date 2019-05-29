package programs;

interface PassingNumber {
	void checkit(int num);
}

public class CheckNumber {
	public static void main(String args[]) {
		PassingNumber ref = (num) -> {
			if (num % 2 == 0) {
				System.out.println("even number");
			} else {
				System.out.println("odd number");
			}
		};
		PassingNumber reference = (num) -> {
			if (num > 0) {
				System.out.println("positive number");
			} else {
				System.out.println("negative number");
			}
		};

		ref.checkit(-17);
		reference.checkit(-17);
	}
}
