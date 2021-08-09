class Emp{
	int id;
	static String ceo;
	static {
		ceo="maha";
		System.out.println("In static");

	}
	
	public Emp() {
		id=7;
		System.out.println("In cons");
	}
	static {
		ceo="maha";
		System.out.println("In static2");

	}
	public void show() {
		System.out.println(id+":"+ceo);
	}
}
public class StaticDemo {
	 static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp naveen=new Emp();
		Emp rahul=new Emp();
		i=7;
	 /*naveen.id=7;
	naveen.ceo="maha";
	Emp.ceo="mahabharathi";
		
		rahul.id=6;
		Emp.ceo="maha";
		//Emp.ceo="mahabharathi";*/
		naveen.show();
		rahul.show();
	}

}
