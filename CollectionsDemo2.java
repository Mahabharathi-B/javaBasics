import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectionsDemo2 {
	public static void main(String[] args) {
		List <Integer>c=new ArrayList<>();
		c.add(788);//Integer v=new Integer(4)
		c.add(786);
		c.add(1,178);
		c.add(67);
//		Comparator<Integer> n=new Comparator<Integer>()
//				{
//			public int compare(Integer i, Integer j) {
//				if(i%10>j%10)
//				return 1;
//				else 
//					return -1;
//			}
//				};
		//Comparator<Integer> n=(i,j) -> (i%10>j%10)?1:-1;
		Collections.sort(c,(i,j) -> (i%10>j%10)?1:-1);
		for(Object k:c) {
			System.out.println(k);
		}
	}
}
