
public class WrapperClass {

	public static void main(String[] args) {
	  int i=18;// primitive
	  Integer k=new Integer(8);// wrapper 
	  Integer j=new Integer(i);// boxing or wrapping
	  int y=k.intValue();// unboxing or unwrapping
      Integer g=i;// autoboxing
      int n=k;// autounboxing
	String str="5678";
	int value=Integer.parseInt(str);
	System.out.println(value);
	System.out.println(g+" "+j+' '+i);
	System.out.println(n+" "+y+' '+k);
	System.out.println(k.getClass());
}
}
