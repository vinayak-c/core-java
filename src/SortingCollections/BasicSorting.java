package SortingCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
		
		String[] sar= {"A","B","C","D","E"};
 		Arrays.sort(sar);
 		System.out.println(Arrays.toString(sar));
 		
 		List<String> fruits=new ArrayList<>();
 		fruits.add("Mango");
 		fruits.add("Apple");
 		fruits.add("Banana");
 		fruits.add("Peach");
 		fruits.add("grapes");
 		Collections.sort(fruits);
 		System.out.println(fruits);
 			
	}

}
