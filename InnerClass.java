class Outer{
	int a;
	public void show() {
		
	}
	static class Inner{
		public void display() {
		   System.out.println("In display");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.show();
		Outer.Inner obj1=new Outer.Inner();
		obj1.display();
	}

}
