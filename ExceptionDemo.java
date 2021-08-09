
public class ExceptionDemo {
public static void main(String[] args) {
	try {
	int i=9/0;//error
	int arr1[]=new int[7];//error1
		int arr[]=null;//NullPointerException
		arr[8]=78;
	
	int k=5/2;
	//System.out.println(k);
	System.out.println(k);
	}
	
	catch(ArithmeticException e) {
		System.out.println("Error on divide by 0");
		//System.err.println("Error");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Error1 on array");
	}
	catch(Exception e) {
		System.out.println("Error");
	}
	finally {
	System.out.println("Hi Maha");
}
}
}