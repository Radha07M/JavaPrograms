package ArrayPrograms;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class secondLargestAnsSmallestNum {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void findSecondLargestAndSmallestNum() {
		int arr[] = {20,10,40,60,4,100,97};
		
		Arrays.sort(arr);
		System.out.println("Sorted array: "+Arrays.toString(arr));
		System.out.println("Second Largest Num: "+arr[arr.length-2]);
		System.out.println("Second Smallest Num: "+arr[1]);
	}
	
	@Test
	public void findSecondLargestAndSmallestNum2() {
		int arr[] = {20,10,40,60,4,100,97};
		
		int largest = arr[0];
		int secondLarge = arr[0];
		int smallest = arr[0];
		int secondSmall = arr[0];
		
		for(int num:arr) {
			if(num>largest) {
				secondLarge = largest;
				largest = num;
			}
			else if(num>secondLarge) {
				secondLarge = num;
			}
			if(num<smallest) {
				secondSmall = smallest;
				smallest = num;
			}
			else if(num<secondSmall) {
				secondSmall = num;
			}
		}
		System.out.println("Largest Num: "+largest);
		System.out.println("Second Largest Num: "+secondLarge);
		System.out.println("Smallest Num: "+smallest);
		System.out.println("Second smallest Num: "+secondSmall);
	}
}
