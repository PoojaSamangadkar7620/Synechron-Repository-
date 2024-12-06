package Java;

public class MethodoverriddingChildClass extends MethodoverriddingParentClass{

	public void display () {
		String color = "White";
		int size = 2244;
		System.out.println(color);
		System.out.println(size);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodoverriddingChildClass obj = new MethodoverriddingChildClass();
		obj.display();

	}
}

