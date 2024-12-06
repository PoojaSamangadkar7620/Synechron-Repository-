package Java;

public class ExcptionHandling1 {

	
	public void arthexp( ) {
		try {
			int data = 10/0;
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
	}
	public static void main(String[] args) {
		ExcptionHandling1 obj = new ExcptionHandling1();
			obj.arthexp();
	}

}
