package StringPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;
/*
 * Java Program to check if One String Rotation of Another
 */
public class RotatingString {
	@Test
	public void rotatingString() {
		Scanner sc = new Scanner(System.in);
		String Original = sc.nextLine();
		System.out.println("First String:"+Original);

		String rotating = sc.nextLine();
		System.out.println("Rotating String:"+rotating);
		
		String concat = Original+Original;
		if(concat.contains(rotating)) {
			System.out.println("Given string is rotating: "+rotating);
		}
		else {
			System.out.println("Given string is not rotating");
		}
	}
}
