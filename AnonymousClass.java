interface Y{
	void show();
}
class Z {
	public void show() {
		System.out.println("Im class");
	}
}
public class AnonymousClass {
public static void main(String[] args) {
	Z obj=new Z() {
		public void show() {
			System.out.println("Im Anonymous class");
		}
	};
	obj.show();
	Y obj1=new Y() {
		public void show() {
			System.out.println("Im Interface");
		}

	};
	obj1.show();
}
}
