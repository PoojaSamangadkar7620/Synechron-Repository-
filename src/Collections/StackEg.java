package Collections;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<Integer>();
		
		
		stk.push(88);
		stk.push(11);
		stk.push(22);
		stk.push(34);
		stk.push(55);
		
		System.out.println(stk);
		System.out.println(stk.isEmpty());    //false
	    System.out.println(stk.peek());
	    System.out.println(stk.search(22));    //true
	}
}
