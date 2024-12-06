package Collections;

import java.util.Vector;
//allow duplicate values
//synchronized 
public class VectorEg {

	public static void main(String[] args) {
		
		Vector<Integer> vc =new Vector<Integer>();
		vc.add(78);
		vc.add(23);
		vc.add(54);
		vc.add(48);
		
		System.out.println(vc.capacity());
		System.out.println(vc.elementAt(1));
		System.out.println(vc.lastElement());
		System.out.println(vc.firstElement());
	}

}
