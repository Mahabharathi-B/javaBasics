import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Stud implements Comparable<Stud>{
	int rollno,marks;
	String name;
	public Stud(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(Stud s) {
		//return marks>s.marks?1:-1;
		return name.length()>s.name.length()?1:-1;
	}
}
public class CollectionsDemooo {
public static void main(String[] args) {
	List <Stud> studs=new ArrayList<Stud>();
	studs.add(new Stud(67,789,"maha"));
	studs.add(new Stud(35,889,"mahiraj"));
	studs.add(new Stud(45,3489,"rajaji"));
	Collections.sort(studs);
	for(Stud s:studs) {
		System.out.println(s);
	}
}
}
