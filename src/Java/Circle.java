package Java;

public class Circle implements Shape{
	public void getarea( ) {
		System.out.println("Area of Circle");
	}
	
	public static void main(String[] args) {

	Circle obj = new Circle();
	obj.getarea();
	
}
}
