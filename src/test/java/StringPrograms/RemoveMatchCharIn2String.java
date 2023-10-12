package StringPrograms;

import org.testng.annotations.Test;

/*
 * Remove characters from the first string which are present in the second string
 */
public class RemoveMatchCharIn2String {
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
