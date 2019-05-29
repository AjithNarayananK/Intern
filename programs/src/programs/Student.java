package programs;

public class Student {
	int rollno;
	String name;
	static String college = "xyz";

	static void change() {
		college = "abc";
	}
	// -------

	// ------
	Student(int r, String n) {
		rollno = r;
		name = n;

	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

}

class StaticMethod {

	public static void main(String args[]) {
		Student.change();

		Student s1 = new Student(7, "ronaldo");

	}
}