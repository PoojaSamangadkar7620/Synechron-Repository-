package Java;

public class Static {
    //non static Variable
	String EmpName = "Pooja";
	//static variable
	static int Empid =7890;
	
	//Local Variable
	String EmpBU = "Testing";
	
	public void displayEmpBU() {

	System.out.println(EmpBU);
	System.out.println(Empid);
	System.out.println(EmpName);
	}
	public static void main(String[] args) {
		
		Static s = new Static();
		
		s.displayEmpBU();
		System.out.println(Empid);
	}

}
