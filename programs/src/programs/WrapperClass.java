package programs;

import java.util.ArrayList;

public class WrapperClass {
	char chh1;
	void autoboxing() {
		  System.out.println("char =" + chh1);
		char ch = 'a';
		Character a = ch;
		System.out.println("class of : " + a.getClass());
		int num = 15;
		Integer intobj = new Integer(num);
		String str = intobj.toString();
		System.out.println(str);
		ArrayList<Integer> Array = new ArrayList<Integer>();
		Array.add(5);
		Array.add(6);
		System.out.println("class of Array : " + Array.getClass());
		for (int i = 0; i < Array.size(); i++) {
			System.out.println("array list : " + Array.get(i));
		}
	}

	public static void main(String[] args) {
		WrapperClass wc = new WrapperClass();
		wc.autoboxing();

	}
}