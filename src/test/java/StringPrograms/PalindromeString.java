package StringPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PalindromeString {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void palindromeString() {
		String str = "Nayan";
		
		String rever = "";
		for(int i=str.length()-1;i>=0;i--) {
			rever = rever.concat(str.charAt(i)+"");
		}
		if(str.equalsIgnoreCase(rever)) {
			System.out.println("String is palindrome - "+rever);
		}
		else {
			System.out.println("String is not palindrome - "+rever);
		}
	}
}
