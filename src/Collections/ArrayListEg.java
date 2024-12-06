package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg {

	//allows duplicate values
			//able to store dynamic data
			//allows null values
			//maintains he insertion order
			//non synchronized multi threading is allowed and if the
			//
			
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list .add("John");
		list.add("Peter");
		list.add("Prasad");
		list.add("Pooja");
		list.add("");
		list.remove(1);
		list.contains("Peter");
		
		System.out.println(list);
		System.out.println(list.contains("Peter"));
		System.out.println(list.isEmpty());
		System.out.println(list.get(2));
		System.out.println(list.size());
		Iterator itr = list.iterator();
		
		while(itr.hasNext());
		System.out.println(itr.next());
		
	
		
	}

}
