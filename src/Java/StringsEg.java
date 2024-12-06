package Java;

public class StringsEg {

	public static void main(String[] args) {
		
		String S1 = "New";
		
		String S2 = "Delhi";
		
		String S3 = "Greater" ;
		
		System.out.println(S1.equals(S2));         // false
	    System.out.println(S1.concat((S2)));      //New Delhi
	    System.out.println(S2.substring((3)));    //hi
	    System.out.println(S2.substring(1,2));    //e
	    System.out.println(S2.contains(("D")));     //true
	    System.out.println(S2.replace("D","Z"));    //Zelli
	    System.out.println(S2.isBlank());           // false
	    System.out.println(S2.isEmpty());           //false
	    String[] arrofstr = S3.split(" ");
	    for (String a : arrofstr) {
	    System.out.println(a);
	    	
	    }
	    
	    String fruits = String.join(" ","Orange","Apple","Mango");
	    System.out.println(fruits);
	    
	    String S4 = "Paneer";
	    String S5 = "butter";
	    
	    System.out.println(S4.compareTo(S5));
	    
	
	
	}  
	

}
