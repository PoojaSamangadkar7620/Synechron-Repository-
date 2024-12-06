package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClassEg {

	public static void main(String[] args) {
		TreeSet<Float> hs = new TreeSet<Float>();
		
		hs.add(78.4f);
		hs.add(23.4f);
		hs.add(43.5f);
		hs.add(67.7f);
		hs.add(98.2f);
		hs.add(12.4f);
		Iterator itr = hs.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			

	}

	}
}