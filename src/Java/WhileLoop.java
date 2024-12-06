package Java;

public class WhileLoop {

	public static void main(String[] args) {
		int count = 0;
		
		while (count <= 5) {
			
			System.out.println(count);
			count++;
		}
		
		// do while
		
		int i =1;
		
		// the expression is evaluated at least once
		do {
			System.out.println(i);
		
		i++;
	} while(i<=10);
	
		
	}

}
