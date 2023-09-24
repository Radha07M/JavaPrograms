package StringPrograms;

import org.testng.annotations.Test;

public class ReverseEachWord {

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
