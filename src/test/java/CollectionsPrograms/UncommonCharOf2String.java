package CollectionsPrograms;

import java.util.*;

import org.testng.annotations.Test;
/*
 * Find uncommon characters of the two strings
 * Input: str1 = “characters”, str2 = “alphabets” 
 * Output: b c l p r
 */
public class UncommonCharOf2String {
	@Test
	public void UncommonCharInString() {
	
		String str1 = "characters";
		String str2 = "alphabets";
		
		Set<Character> set1 = new HashSet<Character>();
		Set<Character> set2 = new HashSet<Character>();
		
		for(char ch:str1.toCharArray()) {
			set1.add(ch);
		}
		System.out.println("Set1: "+set1);
		
		for(char ch:str2.toCharArray()) {
			set2.add(ch);
		}
		System.out.println("Set2: "+set2);
		
		Set<Character> difference = new HashSet<Character>(set1); //last parameter will add all elements from set 1 to difference set
		difference.addAll(set2);
		Set<Character> temp = new HashSet<Character>(set1);	//last parameter will add all elements from set 1 to temp set
		temp.retainAll(set2);	//return the common char
		System.out.println("Common Character in both String: "+temp);
		difference.removeAll(temp);
		
		System.out.println("Uncommon character in a set: "+difference);
		
		StringBuilder sb = new StringBuilder();
		for(char ch:difference) {
			sb.append(ch);
		}
		System.out.println("Final Uncommon string is: "+sb.toString());
	}
}
