class Calculate{  // super,parent,base
	public int add(int i,int j) {
		return i+j;
	}
}
class CalAdv extends Calculate{// sub,child,derived
	public int sub(int i,int j) {
		return i-j;
	}	
}
class VeryAdv extends CalAdv{
public int multi(int i,int j) {
	return i*j;
}
}
public class Inheritance {
public static void main(String[] args) {
	VeryAdv I=new VeryAdv();
	int result=I.add(3, 5);
	int result1=I.sub(5,6);
	int result2=I.multi(5,5);
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
}
}
