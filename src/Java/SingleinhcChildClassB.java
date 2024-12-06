package Java;

public class SingleinhcChildClassB {
	
	public void fetchEmpBU() {
		System.out.println("Employee BU is App1");
	}

	public static void main(String[] args) {
		
		SingleinhParentClassA obj = new SingleinhParentClassA();
		obj.fetchEmpName();
		obj.fetchEmpBU();

	}

}
