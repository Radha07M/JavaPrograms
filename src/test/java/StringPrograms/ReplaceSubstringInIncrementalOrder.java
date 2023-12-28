package StringPrograms;

import org.testng.annotations.Test;

/*
 * Write a java program using string for the below ?
 * Input : Bruhat Bangalore Sapient
 * Output : Bruh@t B@@ng@@@lore S@@@@pient
 */
public class ReplaceSubstringInIncrementalOrder {
	@Test
	public void replaceIncrementalOrder() {
		String str = "Bruhat Bangalore Sapient";
		String point="@";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				str = str.replaceFirst("a", point);
				point=point+"@";
			}
		}
		
		System.out.println(str);
	}
}
