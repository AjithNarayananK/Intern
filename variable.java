import java.io.*;

class GFG {
    static int a;
    static int b=2;
    static int c=5;
	void method(){
	    int a;  //err
	    int num=8;
	    System.out.println("inside method");
	    System.out.println("num= "+num);
	    System.out.println("c= "+c);
	}
	void show(){
	    System.out.println("Inside showc method");
	    System.out.println("a= "+a);
	    System.out.println("b= "+b);
	    System.out.println("c= "+c);
	}
	public static void main (String[] args) {
		GFG obj = new GFG();
		obj.method();
		obj.show();
		System.out.println("inside main");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
	}
}