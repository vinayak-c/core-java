package CursorsInCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorCursor {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Integer> l=new ArrayList<Integer>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		l.add(4);
//		l.add(5);
//		l.add(6);
//		Iterator<Integer> i=l.iterator();
//		System.out.println(l.size());
//		
//		
//		while(i.hasNext())
//		{
//	
//		    System.out.println(i.next());
//		}
		ArrayList<Integer> l = new ArrayList<>();
		for (int i=0; i<=10; i++) {
		l.add(i);
		}
		System.out.println(l);
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
		Integer I = (Integer)itr.next();
		if(I%2 == 0)
		System.out.println(I);
		else
		itr.remove();
		}
		System.out.println(l);
		
		
	}

}
