package StringPrograms;

import org.testng.annotations.Test;

public class AllPermutationString {
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
