package StringPrograms;

import java.lang.reflect.Method;
import java.util.Scanner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
 * Java Program to check if One String Rotation of Another
 */
public class RotatingString {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void rotatingString() {
		Scanner sc = new Scanner(System.in);
		String Original = sc.nextLine();
		System.out.println("First String:"+Original);

		String rotating = sc.nextLine();
		System.out.println("Rotating String:"+rotating);
		
		String concat = Original+Original;
		if(concat.contains(rotating)) {
			System.out.println("Given string is rotating: "+rotating);
		}
		else {
			System.out.println("Given string is not rotating");
		}
	}
}
