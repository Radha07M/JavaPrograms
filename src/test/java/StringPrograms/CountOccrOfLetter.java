package StringPrograms;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * How to Count Occurrences of a Character in String
 * Java program to count occurrences of a character in String
 * https://www.java67.com/2018/04/21-string-programming-and-coding-interview-questions-answers.html
 */
public class CountOccrOfLetter {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void OccurenceOfCharacter() {
		String str="Selenium Tutorials";
		char[] strArr=str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch:strArr) {
			if(map.get(ch)!=null) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		map.remove(' ');
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		if(map.containsKey('e')) {
			System.out.println("No of occurence of letter 'e' in String \'"+str+"\'-> "+map.get('e'));
		}
	}
	
	@Test
	public void countOccurOfLetter() {
		String str = "Selenium Java selenium";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='e') {
				count++;
			}
		}
		System.out.println("No of occurence of letter 'e' in string \'"+str+"\'-> "+count);
	}
}
