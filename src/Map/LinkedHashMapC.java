package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> dayNumber = new LinkedHashMap<>();

		dayNumber.put("Mon", 1);
		dayNumber.put("Tue", 2);
		dayNumber.put("Wed", 3);
		dayNumber.put("Thur", 4);
		dayNumber.put("Fri", 5);
		dayNumber.put("Sat", 6);
		dayNumber.put("NoSuchDay", 8);

		System.out.println(dayNumber);
		System.out.println(dayNumber.putIfAbsent("Sun", 7));
		System.out.println(dayNumber);

		// accessing keys and modifying their associated value
		System.out.println("Using Get: " + dayNumber.get("Sun"));
		System.out.println("Using Size: " + dayNumber.size());
		System.out.println("Using IsEmpty: " + dayNumber.isEmpty());
		System.out.println("Using contains key: " + dayNumber.containsKey("Sun"));
		System.out.println("Using contains Value: " + dayNumber.containsValue(7));

		// using remove
		System.out.println("Using remove(key): " + dayNumber.remove("NoSuchDay"));
		System.out.println("Using remove(key,value): " + dayNumber.remove("NoSuchDay", 7));

		//collection views
		System.out.println(dayNumber.keySet());
		System.out.println(dayNumber.values());
		System.out.println(dayNumber.entrySet());

	}

}
