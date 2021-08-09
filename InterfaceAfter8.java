
interface Demo{
	void doc();
	default void show() {
		System.out.println("I am interface");
	}
}
interface Demo2{
	default void show() {
		System.out.println("I am 2nd interface");
	}
}
class ReDemo implements Demo,Demo2{
	public void doc() {
		System.out.println("I am implemented interface");
	}
	public void show() {
		Demo.super.show();
		Demo2.super.show();
	}
}
public class InterfaceAfter8 {
public static void main(String[] args){
	Demo obj=new ReDemo();
	obj.show();
	obj.doc();
}
}
