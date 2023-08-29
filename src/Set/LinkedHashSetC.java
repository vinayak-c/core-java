package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetC {

	public static void main(String args[])
	{
		Set<String> s= new LinkedHashSet<>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add(null);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.remove("A"));	
	}
}
