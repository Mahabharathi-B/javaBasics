interface M{
	void show();
}
class Maha extends Mahi implements M{
	public void show() {
		System.out.println("I am Interface");
	}
}
class Mahi{
	public void add(int c,int d) {
		System.out.println(c+d);
	}
}
public class InterfaceDemo {
   public static void main(String[] args) {
		Maha obj=new Maha();
		obj.show();
		obj.add(7,8);
	}

}
