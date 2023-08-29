package Map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapC {

	public static void main(String[] args) {
		
		Map<String,Integer> ihm=new IdentityHashMap<>();
		
		ihm.put("one",1);
		ihm.put(new String("one"),1);
		ihm.put("two",2);
		ihm.put("three",3);
		ihm.put("four",4);
		ihm.put("five",5);
		ihm.put("six",6);
		System.out.println(ihm);
		System.out.println(ihm.containsKey("one"));
		System.out.println(ihm.containsValue(1));
		System.out.println(ihm.putIfAbsent("one",100));
		System.out.println(ihm.remove("one",1));
		System.out.println(ihm);
		
	}

}
