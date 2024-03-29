package StringPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Maximum consecutive repeating character in string
 * Input : str = "aaaabbcbbb"
 * Output : a
 */
public class MaxConsecutiveRepeatingChar {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void MaxConsecutiveRepeateChar() {
		String str = "aaaabbcbe";
		int count = 0;		//Storing max count
		int currCount = 1;	//Store count of current char
		char resultChar = str.charAt(0);
		int n = str.length();
		
		for(int i=0;i<n;i++) {
			if(i<n-1 && str.charAt(i) == str.charAt(i+1)) {
				currCount++;
			}
			else {
				if(currCount>count) {
					count = currCount;
					resultChar = str.charAt(i);
				}
				currCount = 1;
			}
		}
		System.out.println("Maximum consecutive repeating character in a string is: "+resultChar);
	}
}
