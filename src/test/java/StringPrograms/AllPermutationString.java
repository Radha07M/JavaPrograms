package StringPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllPermutationString {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void permutationOfString() {
		String str = "123";
		
		recurPermutationStr(str,"");
	}
	public void recurPermutationStr(String str, String result){
		if(str.length() == 0) {
			System.out.println(result);
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			String remainStr = str.substring(0,i)+str.substring(i+1);
			recurPermutationStr(remainStr, result+ch);
		}
	}
}
