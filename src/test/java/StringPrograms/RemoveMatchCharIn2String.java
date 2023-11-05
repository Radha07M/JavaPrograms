package StringPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Remove characters from the first string which are present in the second string
 */
public class RemoveMatchCharIn2String {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void removeMatchCharFromString() {
		String str1 = "occurrence";
		String str2 = "car";
		
		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i);
			while(str1.contains(ch+"")) {
				str1=str1.replace(ch+"", "");
			}
		}
		
		System.out.println(str1);
	}
}
