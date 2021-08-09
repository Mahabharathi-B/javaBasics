
public class TILambda {
	public static void main(String args[]) throws Exception
	{
		Thread obj1=new Thread(() ->
				 {
					for(int i=0;i<5;i++) {
						 System.out.println("Hi"+Thread.currentThread().getName());
						 try {Thread.sleep(500);} catch(Exception e) {}
							}
				 },"Hi thread");
						
		Thread obj2=new Thread(()->
		  {
				for(int i=0;i<5;i++) {
					 System.out.println("Hello");
					 try {Thread.sleep(500);} catch(Exception e) {}
						}
					});
		System.out.println(obj1.getName());
		obj2.setName("Hi");
		System.out.println(obj2.getName());
		obj1.start();
		 try {Thread.sleep(10);} catch(Exception e) {}
		obj2.start();
		//System.out.println(obj1.isAlive());
		
	obj1.join();
		obj2.join();
		//System.out.println(obj1.isAlive());
		System.out.println("bye");
		//System.out.println(obj1.isAlive());
		
	}
}
