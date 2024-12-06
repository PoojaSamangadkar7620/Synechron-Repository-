package Java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereading {

	public static void main(String[] args) throws IOException {
		try {
		
		
	FileInputStream fin = new FileInputStream("C://Users//Public//Pooja//HellowWorld.txt");
	
     
		//	int i = fin.read();
			
	   // System.out.println(char)i;
	    
	  //  fin.close();
	
	int i =0;
	
	while ((i = fin.read())!=-1) {
		
		 System.out.println((char)i);
	}
	
	String s = "Welcome to javaTpoint";
	
	byte b[]=s.getBytes();
	
    fin.write(b);
    fin.close();
    System.out.println("Success");
		}catch(Exception e) {System.out.println(e);}
	}

}
