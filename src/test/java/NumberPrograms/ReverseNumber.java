package NumberPrograms;

import org.testng.annotations.Test;

public class ReverseNumber {
	@Test
	public void reverseNumber() {
		int number = 67542;
		int reminder, sum=0;
		
		while(number>0) {
			reminder = number%10;
			System.out.println(reminder);
			
			sum=sum*10+reminder;
			System.out.println(sum);
			
			number = number/10;
			System.out.println(number);
			System.out.println("------------");
		}
	}
}
