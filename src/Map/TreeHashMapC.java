package Map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeHashMapC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*SortedMap<String, Integer> stm = new TreeMap<>();

		// using methods of sortedMap
		stm.put("A", 1);
		stm.put("B", 2);
		stm.put("C", 3);
		stm.put("D", 4);
		stm.put("E", 5);
		stm.put("F", 6);
		System.out.println(stm);
		System.out.println("Using firstKey: " + stm.firstKey());
		System.out.println("Using lastKey: " + stm.lastKey());
		System.out.println("Using tailmap: " + stm.tailMap("D"));
		System.out.println("Using headmap: " + stm.headMap("D"));
		System.out.println("Using containsKey: " + stm.containsKey("D"));
		System.out.println("Using containsValue: " + stm.containsValue(4));
		System.out.println("Using Replace: " + stm.replace("D", 40));
		System.out.println("Using Put: " + stm.put("F", 60));
		System.out.println("Using Keyset: " + stm.keySet());
		System.out.println("Using EntrySet: " + stm.entrySet());
		System.out.println("Using values: " + stm.values());
		System.out.println(stm);*/
		
		NavigableMap<String,Integer> ntm=new TreeMap<String, Integer>();
		
		//using methods of navigable map
		
		ntm.put("A",1);
		ntm.put("B",2);
		ntm.put("C",3);
		ntm.put("D",4);
		ntm.put("E",5);
		ntm.put("F",6);
		ntm.put("G",7);
		ntm.put("H",8);
		
		System.out.println(ntm);
		System.out.println("Using firstKey: "+ntm.firstKey());
		System.out.println("Using lastKey: "+ntm.lastKey());
		System.out.println("Using firstEntry: "+ntm.firstEntry());
		System.out.println("Using lastEntry: "+ntm.lastEntry());
		System.out.println("Using celingKey: "+ntm.ceilingEntry("B"));
		System.out.println("Using descendingMap"+ntm.descendingMap());
		System.out.println("Using headMap: "+ntm.headMap("D",true));
		System.out.println("using tailMap: "+ntm.tailMap("D",false));
		System.out.println("Using higherEntry: "+ntm.higherEntry("D"));
		System.out.println("Using lowerEntry: "+ntm.lowerEntry("D"));
		System.out.println("Using subMap: "+ntm.subMap("D","H"));
		System.out.println("Using subMap(Range): "+ntm.subMap("D",false,"H",true));

	}

}
