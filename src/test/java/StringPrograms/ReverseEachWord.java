package StringPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReverseEachWord {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void reverseEachWord() {
		// TODO Auto-generated method stub
		String s = "Selenium Interview";
		//Output = "muineleS weiv";
	
		String final1="";
		String str[] = s.split(" ");
		for(String s1:str){
			String temp="";
			int size = s1.length();
			for(int i=size-1; i>=0;i--){
				char ch = s1.charAt(i);
				temp = temp + String.valueOf(ch);
			}
			final1 = final1+" "+temp;
		}
		System.out.println("Output: -"+final1);
	}
}
