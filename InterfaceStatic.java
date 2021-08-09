interface Baby{
	void call();
	static void show() {
	     System.out.println("I am static within interface");	
	}
}
public class InterfaceStatic {
public static void main(String[] args) {
 Baby.show();	
}
}
