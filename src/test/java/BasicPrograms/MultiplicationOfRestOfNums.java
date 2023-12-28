package BasicPrograms;

import org.testng.annotations.Test;

/*
 * input --> 3,4,5,6
 * O/P--> 120 90 72 60
 */
public class MultiplicationOfRestOfNums {

	@Test
	public void MultiplicationOfRestOfNumbers() {
		int arr[] = {3,4,5,6};
		int result[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int mul = 1;
			int currentNum = arr[i];
			for(int j=0;j<arr.length;j++) {
				if(arr[j]!=currentNum) {
					mul = mul*arr[j];
				}
			}
			result[i] = mul;
		}
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
		
	}
}
