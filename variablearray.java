import java.io.*;
class GFG {
    int[] arr1=new int[5];
    void knock(int a, int ...arr){
		    System.out.println("a= "+ a);
		    arr1 = arr;
		    for(int i:arr1){
		    System.out.print(" "+ i);
		    }
    }
	public static void main (String[] args) {
		GFG obj = new GFG();
		obj.knock(5,1,5,6,7,7);
	}
}