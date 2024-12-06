package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetEG {

	public static void main(String[] args) {
		LinkedHashSet<Float> hs = new LinkedHashSet<Float>();
		
		hs.add(78.4f);
		hs.add(23.4f);
		hs.add(43.5f);
		hs.add(67.7f);
		hs.add(98.2f);
		hs.add(null);
		hs.add(12.4f);
		Iterator itr = hs.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			

	}


	}

}
