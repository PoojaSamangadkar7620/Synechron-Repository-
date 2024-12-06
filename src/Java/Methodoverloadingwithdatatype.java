package Java;

public class Methodoverloadingwithdatatype {
	
	public void add(int a, float b) {
		float c = a+b;
		System.out.println(c);
	}
	public void add (int a, float b, double c) {
		double d =a+b+c;
		System.out.println(d);
			
	}

	public static void main(String[] args) {
		Methodoverloadingwithdatatype obj = new Methodoverloadingwithdatatype();
		obj.add(1,2.5f);
		obj.add(7,4.5f,547.32d);

	}

}
