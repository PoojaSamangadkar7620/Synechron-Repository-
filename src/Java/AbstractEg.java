package Java;

 abstract class AbstractEg {

	 //abstarct class can conain both default and abstract methods
	 //absract method have only method signaure, no method body
	 //no object creation of a abstract class
	 //we can achieve 0 to 80 perc of abstraction
	 
	 //Default mehod
	public void display() {
		System.out.println("Diplaying in default method");
	}
		abstract void read();
		public static void main(String[] args) {
			AbstractEg obj = new Abstract Eg();
		}
	
}
