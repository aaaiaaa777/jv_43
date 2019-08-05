package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		   Properties p = new Properties();
		   p.load(new FileInputStream("input.properties"));
		
	System.out.println("Password: " + p.getProperty("password"));

	}

}
