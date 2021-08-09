//import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List <Integer>c=new ArrayList<>();
		c.add(7);//Integer v=new Integer(4)
		c.add(78);
		c.add(1,1);
		Collections.sort(c);
		
		//c.add("maha");genrics
		System.out.println(c);
//		Iterator it=c.iterator();
//		while(it.hasNext()) {
//		System.out.println(it.next());
		//}
		for(int i=0;i<c.size();i++) {
			System.out.println(c.get(i));
		}
		Collections.reverse(c);
		for(Object i:c) {
			System.out.println(i);
		}
	}
}
