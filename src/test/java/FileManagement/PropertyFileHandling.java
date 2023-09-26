package FileManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PropertyFileHandling {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test(priority = 0)
	public void writePropertyFile() {
		try {
			Properties prop = new Properties();
			prop.put("firstName","John");
			prop.put("lastName","Smith");
			
			FileOutputStream fileOut = new FileOutputStream(new File(".//src//test//resources//TestData//propertyFile.properties"));
			prop.store(fileOut, "Property file created and store the data");
			System.out.println("Property file created and store the data");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 1)
	public void readPropertyFile() {
		try {
			FileInputStream fileIn = new FileInputStream(new File(".//src//test//resources//TestData//propertyFile.properties"));
			Properties prop = new Properties();
			prop.load(fileIn);
			
			String firstName = prop.getProperty("firstName");
			System.out.println("First Name: "+firstName);
			
			String lastName = prop.getProperty("lastName");
			System.out.println("Last Name: "+lastName);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
