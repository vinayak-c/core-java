package Set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableSet<String> ts=new TreeSet<String>();
		SortedSet<String> sts=new TreeSet<String>(Comparator.reverseOrder());
		NavigableSet<Double> stsi=new TreeSet<Double>();
		TreeSet<String> ts1=new TreeSet<>();
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("F");
		ts.add("G");
		ts.add("H");
		System.out.println("Normal Order: "+ts);
		
		sts.add("A");
		sts.add("B");
		sts.add("C");
		sts.add("D");
		sts.add("E");
		sts.add("F");
		sts.add("G");
		sts.add("H");
		
		stsi.add(1.0);
		stsi.add(2.0);
		stsi.add(3.0);
		stsi.add(4.0);
		stsi.add(5.0);
		stsi.add(6.0);
		stsi.add(7.0);
		stsi.add(8.0);
		
		System.out.println("Reversed Navigable TreeSet: "+ts.descendingSet());
		System.out.println("Reversed Sorted TreeSet: "+sts);
		
		//Accessing elements
		System.out.println("Using Contains: "+ts.contains("B"));
		System.out.println("Using first: "+ts.first());
		System.out.println("Using Last: "+ts.last());
		
		//removing elements
		System.out.println("Using remove element (E): "+ts.remove("E"));
		System.out.println("Using pollFirst: "+ts.pollFirst());
		System.out.println("Using pollLast: "+ts.pollLast());
		System.out.println("After removal of elements: "+ts);
		
		//Using navigable methods
		System.out.println("Using ceiling: "+stsi.ceiling(4.5));
		System.out.println("Using floor: "+stsi.floor(4.5));
		System.out.println("Using Headset: "+stsi.headSet(5.0));
		System.out.println("Using Headset with Boolean: "+stsi.headSet(5.0,true));
		System.out.println("Using TailSet: "+stsi.tailSet(5.0));
		System.out.println("Using TailSet with Boolean: "+stsi.tailSet(5.0,false));
		System.out.println("Using Higher: "+stsi.higher(4.5));
		System.out.println("Using Lower: "+stsi.lower(4.5));
		System.out.println("Using Subset: "+stsi.subSet(4.0,9.0));
		System.out.println("Using Subset: "+stsi.subSet(4.0,false,9.0,true));
		System.out.println("Checking comparator: "+stsi.comparator());
		System.out.println("Checking comparator: "+sts.comparator());
		
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");
		ts1.add("D");
		
		System.out.println(ts1.size()+" "+ts1.contains("A"));
		
		
	}

}
