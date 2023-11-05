package NumberPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Reverse a number
 */
public class ReverseNumber {
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void reverseNumber() {
		int number = 67542;
		int reminder, sum=0;
		
		while(number>0) {
			reminder = number%10;
			
			sum=sum*10+reminder;
			
			number = number/10;
		}
		System.out.println("Reverse Num:" +sum);
	}
}
