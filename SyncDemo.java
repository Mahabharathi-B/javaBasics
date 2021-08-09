class Demo6{
	int c;
	public void increment() {
		c++;
	}
}
public class SyncDemo {
public static void main(String[] args) throws Exception {
	Demo6 k=new Demo6();
	Thread j=new Thread(new Runnable() {
		
			public void run() {
				for(int i=0;i<1000;i++)
		        k.increment();
			}
	});
	Thread j1=new Thread(new Runnable() {
		
		public void run() {
			for(int i=0;i<1000;i++)
	        k.increment();
		}
});
	j.start();
	//j.join();
	j1.start();
	j.join();
	j1.join();
	
	System.out.println(k.c);
}
}
