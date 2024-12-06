package Java;

public class MethodoverloadingEg {

    public void add (int a, int b) {
    	int c = a+b;
    	
    	System.out.println(c);
    	
    }
    
    public void add(int a,int b,int c) {
    	int d =a+b+c;
    	System.out.println(d);
    }
    
    public void add(int a,int b,int c, int d) {
    	int e =a+b+c+d;
    	System.out.println(e);
    }
    	
	public static void main(String[] args) {
		MethodoverloadingEg obj = new MethodoverloadingEg();
		obj.add(2,3);
		obj.add(3,4,4);
		obj.add(3, 4,5,5);
		
	}

}
