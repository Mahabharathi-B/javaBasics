 class Calc1{
	 int num1;
	 int num2,result;
	 public Calc1() {
		 num1=5;num2=3;
		 System.out.println(num1);
	 }
 public Calc1(int num1,double num2) {
		 this.num1=num1;
		num2=(int)num2;//need this
	 }
 }
public class Constructor{
	public static void main(String[] args) {
		Calc1 obj=new Calc1();
	     // obj.Calc1(9,5.6);
		System.out.println(obj.num2);
		System.out.println(obj.num1+obj.num2);

	}
}