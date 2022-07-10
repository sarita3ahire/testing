package Collection;

import java.util.ArrayList;

import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		
		//ArrayList----best choice to retrival/get values esaily
		//LinkedList----best choice to insert/delete operation
		ArrayList li=new ArrayList();
		li.add("sarita");
		li.add("sarita");
		li.add(10);
		li.add(10);
		li.add(30);
		li.add("ahire");
		li.add(null);
		li.add(null);
		 Iterator i=li.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
	}

	
}
