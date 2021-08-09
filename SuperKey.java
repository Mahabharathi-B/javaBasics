class A{
	public A() {
		System.out.println("In A");
	}
	public A(int b) {
		System.out.println("In A1");
	}
	public void method() {
		System.out.println("In Amethod");
	}
	
}
class B extends A{// default super() for every method
	public B() {
		super(5);
		System.out.println("In B");
	}
	public B(int b) {//constructor overloading
		super(b);
		System.out.println("In B1");
	}
public void method() {//method overridding
	super.method();
	System.out.println("In Bmethod");
	}

}
public class SuperKey {

	public static void main(String[] args) {
		A obj=new B();
		//B obj2=new B(5);
		obj.method();
	}

}
