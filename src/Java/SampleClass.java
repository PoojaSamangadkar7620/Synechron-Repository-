package Java;

public class SampleClass {
	
	
	
	String EmployeeName = "Pooja";
	int EmployeeID = 70654;
	String EmployeeBU = "App1";
	
	 public void fetchdomain () {		
	    	
	    	System.out.println("Testing");
	    }
	

	public static void main(String[] args) {

		
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.EmployeeName);
		System.out.println(sc.EmployeeID);
		System.out.println(sc.EmployeeBU);
		sc.fetchdomain();
	}
   
    


	}



