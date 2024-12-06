package AccessModifier;

public class File1 {



public String S1 = "New Delhi";
	
	public int zipcode = 7654;
	
	//only in the same class
	private String address = "St peters road";
	
	//same package or the sub classes in different packages 
	protected String city = "banglore";
	
	//default 
	String BU = "Testing";
	
	public static void main(String[] args) {
		
		File1 obj = new File1();
				System.out.println(obj.S1);
		       System.out.println(obj.zipcode);
		       System.out.println(obj.address);
		       System.out.println(obj.city);
		       System.out.println(obj.BU);
	}

}
