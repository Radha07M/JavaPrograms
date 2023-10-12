package NumberPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Palimdrom number
 */
public class PalindromeNumber {
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void PalindromNumber() {
		int number = 12321;
		int reminder, sum=0;
		int no=number;
		
		while(number>0) {
			reminder = number%10;			
			sum=sum*10+reminder;			
			number = number/10;
		}
		if(no==sum) {
			System.out.println(no+" is a palindrome number");
		}
		else {
			System.out.println(no+" is not a palindrome number");
		}
	}
}
