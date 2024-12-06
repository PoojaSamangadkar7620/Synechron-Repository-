package Java;

public class ExceptionhandlingEg {

	public void nulldisplay() {
		

	try {
		
		String s = null;
	
		System.out.println(s.length());
	}
    
	catch(Exception e) {
	
		e.printStackTrace();	
		
	}
	}
	public static void main(String[] args) {
		ExceptionhandlingEg obj = new ExceptionhandlingEg();
		obj.nulldisplay();

	
	}
	}

