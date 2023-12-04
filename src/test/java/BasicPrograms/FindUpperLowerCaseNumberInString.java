package BasicPrograms;

import org.testng.annotations.Test;

public class FindUpperLowerCaseNumberInString {
	@Test
	public void findLetterCase() {
		String str = "abcdABCD1234#$#$";
		int upper=0, lower=0, symbol=0, number=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				upper++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				lower++;
			}
			else if(ch >= '0' && ch <= '9') {
				number++;
			}
			else if(ch == '#' || ch <= '$') {
				symbol++;
			}
		}
		System.out.println("Upper Case: "+upper);
		System.out.println("Lower Case: "+lower);
		System.out.println("Numbers: "+number);
		System.out.println("Symbols: "+symbol);
	}
}
