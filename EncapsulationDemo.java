class Stu{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
      Stu s=new Stu();	
      s.setName("maha");
      s.setRollno(7);
      System.out.println(s.getName());
      System.out.println(s.getRollno());
     System.out.println(s.getClass());      

	}

}
