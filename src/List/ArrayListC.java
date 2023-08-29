package List;

import java.io.Serializable;
import java.util.*;


public class ArrayListC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=new ArrayList<>();
		List<String> l2=new ArrayList<>();
		List<String> l3=Collections.synchronizedList(l2);
		
		
		
		l.add("A");
		l.add("B");
		l.add("A");
		l.add(null);
		System.out.println(l);
		
		//l.remove(2);
		//System.out.println(l);
		//l.set(2,2);
		//System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.lastIndexOf("A"));
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
	}

}
