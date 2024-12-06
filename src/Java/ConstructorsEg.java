package Java;

public class ConstructorsEg {
	//const name is same as class name
	//const called when object class is created
	//consts do no have explicit return type - void, int, string
	//consts cannot be defined as static, fonal synchronized
	//const are used to initialize the variable
	//
	
	String S1;
	int id;
	
	 ConstructorsEg(String a, int i) {
		 
		System.out.println("I am the constructor");
		System.out.println(S1 +" "+id);
		System.out.println("Launching chrome browser"); 
		System.out.println(a);
		System.out.println(i);
		
	}
	
	public void Testcase1() {
		System.out.println("Testcase1 is executed");
	}
	public void Testcase2() {
		System.out.println("Testcase2 is executed");
	}
	public void Testcase3() {
		System.out.println("Testcase3 is executed");
	}

	public static void main(String[] args) {
		ConstructorsEg obj = new ConstructorsEg("Pooja", 234);
		obj.Testcase1();
		obj.Testcase2();
		obj.Testcase3();
		
		
	}

}
