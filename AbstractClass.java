abstract class Human{
	public abstract void show();
	public abstract void walk(Number i);
}
class Man extends Human{// concrete class
public void show() {
		System.out.println("Abstract Working");
	}
public void walk(Number i) {
	System.out.println(i);
}
}
public class AbstractClass {
	public static void main(String[] args) {
		Human h=new Man();
		h.show();
		h.walk(5.6);
	}
}
