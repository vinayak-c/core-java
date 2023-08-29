package UtilityClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   List<String> fruitsList=new ArrayList<>();
	   
	   fruitsList.add("Apple");
	   fruitsList.add("Mango");
	   fruitsList.add("Pear");
	   System.out.println(fruitsList);
	   
	   String[] farr= {"Peach","Guava","Berry"};
	   Collections.addAll(fruitsList,farr);
	   Collections.addAll(fruitsList,"Lichi","Grape");
	   System.out.println(fruitsList);
	   
	   //sorting
	   Collections.sort(fruitsList);
	   System.out.println(fruitsList);
	   Collections.sort(fruitsList,Comparator.reverseOrder());
	   System.out.println(fruitsList);
	   
	   
	}

}
