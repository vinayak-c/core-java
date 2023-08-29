package Map;

import java.util.Hashtable;

public class HashTableC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String,Integer> ht=new Hashtable<String, Integer>();
		
		ht.put("One",1);
		ht.put("Two",2);
		ht.put("Three",3);
		ht.put("Four",4);
		ht.put("Five",5);
		ht.put("Six",6);
		ht.put("Seven",7);
		//ht.put("eight",null);
		
		System.out.println(ht);
		
	}

}
