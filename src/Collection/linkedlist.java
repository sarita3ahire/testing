package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(23);
		li.add("sarita");
		li.add("sarita");
		li.add(56);
		li.add(null);
		li.add(null);
		
		
		 Iterator i=li.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }

	}

	
}
