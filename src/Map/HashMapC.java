package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> numberMapping = new HashMap<>();

		numberMapping.put("one", 1);
		numberMapping.put("two", 2);
		numberMapping.put("three", 3);
		numberMapping.put("four", 4);

		// returns old value if key already present with some value
		System.out.println(numberMapping.putIfAbsent("four", 10));
		// return null bcoz no duplicate five key is present
		System.out.println(numberMapping.put("five", 5));
		System.out.println(numberMapping);

		// accessing keys and modifying their associated value
		System.out.println("IsEmpty: " + numberMapping.isEmpty());
		System.out.println("Size: " + numberMapping.size());
		System.out.println("ContainsKey: " + numberMapping.containsKey("four"));
		System.out.println("ContainsValue: " + numberMapping.containsValue(4));
		System.out.println("Using Get(): " + numberMapping.get("two"));
		System.out.println("Replacing Using Put(): " + numberMapping.put("four", 40));

		// removing values
		System.out.println("Using remove: " + numberMapping.remove("ten"));
		System.out.println("Using remove(key,value): " + numberMapping.remove("four", 4));

		// trying to insert null values
		System.out.println("Null insertion: " + numberMapping.put(null, 100));
		System.out.println(numberMapping);
		System.out.println(numberMapping.get(null));
		numberMapping.put(null, 200);
		System.out.println(numberMapping);

		// collection views of Map
		System.out.println(numberMapping.keySet());
		System.out.println(numberMapping.values());
		System.out.println(numberMapping.entrySet());

		// iterating hashmap using for and while
		for (Entry<String, Integer> entry : numberMapping.entrySet()) {
			System.out.println("key is: " + entry.getKey() + " " + "Value is: " + entry.getValue());
		}

		Set<Entry<String, Integer>> entry = numberMapping.entrySet();
		for (Entry<String, Integer> pair : entry) {
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
	}

}
