class Add{
	int num1=5;
	public Add(int n,int y) {
		 num1=n+y;
		 System.out.println(num1);
	}
  public Add(int i) {
		
	}
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	public void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
}
public class MethodOverloading {
public static void main(String[] args) {
	Add obj=new Add(2,5);
	obj.add(4,5);
	obj.add(5, 6,7);
}
}
