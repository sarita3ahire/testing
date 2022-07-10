package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemvDuplicatefromArray {

	public static void main(String[] args) {
		int a[]= {20,67,30,20,10,67,10,2,9,10,20};
		int count=0;
		//add all ele into arraylist
		ArrayList<Integer> array=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			array.add(a[i]);
			
		}
		System.out.println(array);
		
		
		//remove duplicate elements
		
		HashSet<Integer> h=new HashSet<Integer>(array);
        System.out.println(h);//order not maintain, randomly print
        
        LinkedHashSet<Integer> lh=new  LinkedHashSet<Integer>(array);
        System.out.println(lh);//order is maintain
	}

}
