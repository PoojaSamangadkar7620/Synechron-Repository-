package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsEg {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
	
		
		map.put(1,"Pooja");
		map.put(2,"Prasad");
		map.put(3,"Pranjal");
		map.put(4,"Shunham");
		
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while (itr.hasNext())  {
			
			Map.Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey() + " " +entry.getValue());
			}
		
		

	}

}
