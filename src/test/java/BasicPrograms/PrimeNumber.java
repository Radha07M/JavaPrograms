package BasicPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

/*
 * Prime number is a number that is greater than 1 and divided by 1 or itself only.
 * Example- 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */
public class PrimeNumber {
	@Test
	public void primNumber() {
		Scanner sn = new Scanner(System.in);
		int number = sn.nextInt();
		
		System.out.println("Entered number is- "+number);
		int m=0,flag=0;
		
		m=number/2;
		if(number==0 || number==1) {
			System.out.println("Number is not a prime number");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(number%i == 0) {
					flag=1;
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.println("Number is a prime number");
		}
		else {
			System.out.println("Number is not a prime number");
		}		
	}
}
