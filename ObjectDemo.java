class Calc{
	
		int result;
	int perform(int num1,int num2) {
		
		result=num1+num2;
		return result;
	}
	}
public class ObjectDemo {
public static void main(String[] args) {
	Calc obj=new Calc();
	//obj.num1=1;
	//obj.num2=10;
	obj.perform(1,10);
	System.out.println(obj.result);
	System.out.println(obj.perform(1,10));
}
}
