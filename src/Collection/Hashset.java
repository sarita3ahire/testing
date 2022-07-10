package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		//HashSet--not maintain order(randomly)
		//LinkedHasSet-- maintain the order
		//TreeDet----ascending order maintain
		HashSet h=new HashSet();
		h.add("sarita");
		h.add("sarita");
		h.add(12);
		h.add(null);
		h.add(null);
		
		//System.out.println(h); //print valuess in array format
		
		//print values normal format
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
