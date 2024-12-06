package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFiles {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fin = new FileInputStream("C:\\Users\\kiosk_user\\eclipse-workspace\\Automation_Test\\ConfigfileEg");
		
		prop.load(fin);
		fin.close();
		
		
		
	}

}
