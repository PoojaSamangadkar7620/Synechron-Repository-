package Java;

public class EncapsulationEg {

	private String Name;
	
	private int id;
		
		//getter methods to fetch the private data 
		//setter methods to set the data
		
	public void getname() {
		System.out.println(Name);
	}
	public void setname (String n) {
		this.Name =n;
		

	}
	
	public void getid() {
		System.out.println(id);
	}
	public void setid (int i) {
		this.id =i;
	
}
	public static void main(String[] args) {
		EncapsulationEg obj = new EncapsulationEg();
		obj.setname("Prasad");
		obj.setid(887799);
		obj.getname();
		obj.getid();
	}
}