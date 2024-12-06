package Java;

public class AbstractChildClass extends AbstractEg{

	

	@Override
	void read() {
		System.out.println("Displaying in the child abstract class");
		
	}
public static void main(String[] args) {
		
	AbstractChildClass obj = new AbstractChildClass();
	
	obj.display();
	obj.read();
	}

}
