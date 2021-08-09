import java.util.Set;
import java.util.TreeSet;
public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> n=new TreeSet<>();
		System.out.println(n.add(6));
		System.out.println(n.add(346));
		System.out.println(n.add(6));
		System.out.println(n.add(634));
		for(int i:n) {
			System.out.println(i);
		}
	}
}
