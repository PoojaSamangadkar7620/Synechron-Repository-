package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.Reader;
import java.util.Properties;

public class TestCase {

	private static final Reader Reader = null;

	public static <FileInputstream> void main(String[] args) {
		
		
		Properties props = new Properties();
		
		FileInputstream reader = new FileInputstream ("C:\\Users\\kiosk_user\\eclipse-workspace\\Automation_Test\\ConfigfileEg");
		
		props.load(Reader);
		
		String username = props.getProperty("username");
		
		System.out.println(username);
		
		String password = props.getProperty("password");
		
		System.out.println(password);
		
		String env = props.getProperty("environment");
				
		System.out.println(env);
	}

}
