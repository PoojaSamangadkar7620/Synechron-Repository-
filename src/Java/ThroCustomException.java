package Java;

public class ThroCustomException {

	public void validateage(int age) {
		if (age < 18) {
			 
			throw new ArithmeticException("Person is not eligible for voting");
		}else {
			System.out.println("Person is eligible for voting");
		}

			
			
			
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ThroCustomException obj = new ThroCustomException();
		obj.validateage(17);
	}

}
