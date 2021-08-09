import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("myName", "Maha");
		map.put("actor", "raja");
		map.put("actor", "rajan");

		map.put("actoress", "rajii");
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println(map);
	}
}
