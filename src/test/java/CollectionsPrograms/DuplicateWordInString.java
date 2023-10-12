package CollectionsPrograms;

import java.lang.reflect.Method;
import java.util.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
 * Java Program to find duplicate words in String
 */
public class DuplicateWordInString {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void duplicateWordInStringUsingMap() {
		String s="This is a selenium interview selenium";
		String str[]=s.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s1:str){
			if(map.get(s1)!=null){
				map.put(s1,map.get(s1)+1);
			}
			else {
				map.put(s1, 1);
			}
		}
		for(Map.Entry<String, Integer> map1:map.entrySet()) {
			if(map1.getValue()>=2) {
				System.out.println(map1.getKey()+" "+map1.getValue());
			}
		}	
	}
	
	@Test
	public void duplicateWordInStringUsingSet() {
		String s="This is a selenium interview selenium";
		String str[]=s.split(" ");
		
		Set<String> wordSet = new HashSet<String>();
		Set<String> duplicates = new HashSet<String>();
		
		for(String word:str) {
			if(!wordSet.add(word))
				duplicates.add(word);
		}
		System.out.println("Input: "+s);
		System.out.println("Output: "+duplicates);
	}
}
