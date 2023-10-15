package StringPrograms;

import org.testng.annotations.Test;

public class PalindromeString {
	@Test
	public void palindromeString() {
		String str = "Nayan";
		
		String rever = "";
		for(int i=str.length()-1;i>=0;i--) {
			rever = rever.concat(str.charAt(i)+"");
		}
		if(str.equalsIgnoreCase(rever)) {
			System.out.println("String is palindrome - "+rever);
		}
		else {
			System.out.println("String is not palindrome - "+rever);
		}
	}
}
