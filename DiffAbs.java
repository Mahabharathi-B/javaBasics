abstract class Writer{
	public abstract void write();
}
class Pen extends Writer{
	public void write() {
		System.out.println("I am abstract");
	}
}
class Pencil extends Writer{
	public void write() {
		System.out.println("I am abstract2");
	}
}
class Kit{
	public void method(Writer p) {
		p.write();
	}
}
public class DiffAbs {
public static void main(String[] args) {
	Kit i=new Kit();
	Writer p=new Pen();
	Writer pc=new Pencil();
	i.method(pc);
	i.method(p);
}
}
