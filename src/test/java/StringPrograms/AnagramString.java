package StringPrograms;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Check whether given two strings are anagram or not
 * two String is called anagram, if they contain the same characters but on different order
 */
public class AnagramString {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void angramString() {
		String str1 = "Army";
		String str2 = "Mary";
		str1 = str1.toLowerCase();
		str2= str2.toLowerCase();
		
		if(str1.length() == str2.length()) {
			for(int i=0;i<str1.length();i++) {
				char ch = str1.charAt(i);
				if(str2.contains(ch+"")) {
					int index = str2.indexOf(ch);
					str2 = str2.replace(str2.charAt(index)+"", "");
				}
			}
			if(str2.isEmpty()) {
				System.out.println("Strings are anagram");
			}
			else {
				System.out.println("Strings are not anagram");
			}
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}
	
	@Test
	public void angramString2() {
		String str1 = "Army";
		String str2 = "Mary";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}
}
