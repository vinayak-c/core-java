package Set;

import java.util.HashSet;

public class HashSetC {

	public static void main(String[] args)
	{
		HashSet<String> h=new HashSet<String>();
		h.add("Z");
		h.add("E");
		h.add("A");
		h.add("D");
		h.add(null);
		System.out.println(h.add("A"));
		System.out.println(h.add("B"));
		System.out.println(h);
	}
}
