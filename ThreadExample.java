class Hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
	 System.out.println("Hi");
	 try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		try {Thread.sleep(500);} catch(Exception e) {}
	}
	}
}
public class ThreadExample {
public static void main(String args[]) {
	Hi n=new Hi();
	Hello b=new Hello();
	
	n.start();
	 try {Thread.sleep(10);} catch(Exception e) {}
	b.start();
	
	//n.run();
	//b.run();
}
}
