package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayLinkedList {

	public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
		
		list .add("John");
		list.add("Peter");
		list.add("Prasad");
		list.add("Pooja");
		list.contains("John");
		
		
		System.out.println(list);
		System.out.println(list.contains("John"));
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
	


	}

}
