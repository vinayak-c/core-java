package List;

import java.util.Vector;

public class VectorC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v=new Vector<String>();
		
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.addElement("E");
		v.add(3,"*");
		System.out.println(v);
		
		v.set(2,"ALl");

		System.out.println(v);

	}

}
