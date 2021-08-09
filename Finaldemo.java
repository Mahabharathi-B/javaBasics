final class I{
	final int v;
	
	public I(){
	v=78;
}
	public final void show() {// can't override
		
	}
}

public class Finaldemo {
  public static void main(String[] args) {
	  I obj=new I();
	  System.out.println(obj.v);
  }
}
