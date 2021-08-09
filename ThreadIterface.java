
//class Hello1 implements Runnable{
//	public void run() {
//		for(int i=0;i<5;i++) {
//		System.out.println("Hello");
//		try {Thread.sleep(500);} catch(Exception e) {}
//	}
//	}
//}
public class ThreadIterface {
	public static void main(String args[]) {
	Runnable n=() ->
		       {
				for(int i=0;i<5;i++) {
					 System.out.println("Hi");
					 try {Thread.sleep(500);} catch(Exception e) {}
						}
					};
		
	Runnable b=new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(500);} catch(Exception e) {}
			}
			}
	};
	Thread obj1=new Thread(n);
	Thread obj2=new Thread(b);
	obj1.start();
	 try {Thread.sleep(10);} catch(Exception e) {}
	obj2.start();
}
}
