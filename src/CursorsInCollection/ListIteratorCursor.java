package CursorsInCollection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   List<String> list=new LinkedList<String>();
	   
	   list.add("A");
	   list.add("B");
	   list.add("C");
	   list.add("D");
	   list.add("E");
	   
	   ListIterator<String> itr=list.listIterator();
	   while(itr.hasNext())
	   {
		   System.out.println("index of element:"+itr.nextIndex()+" value: "+itr.next());
	   }
	   
	   System.out.println("\n");
	   for(String s:list)
	   {
		   System.out.println(s);
	   }
	   
	   System.out.println("\n");
	   // Traversing elements, the iterator is at the end at this point
	   while(itr.hasPrevious())
	   {
		   
		   System.out.println("index of element: "+itr.previousIndex()+" Value: "+itr.previous());
	   }
	   
	   //performing curd 
	   while(itr.hasNext())
	   {
		   String s=itr.next();
		   if(s.equals("B"))
		   {
			   System.out.println("B changed to small");
			   itr.set("b");
		   }
		   if(s.equals("C"))
		   {
			   System.out.println("Removing C");
			   itr.remove();
		   }
		   if(s.equals("E"))
		   {
			   System.out.println("Adding F");
			   itr.add("F");
		   }
	   }
	   
	   System.out.println(list);
	   
	   System.out.println("Internal implementation of Iterator");
	   System.out.println(itr.getClass().getName());
	}

} 
