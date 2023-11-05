package SearchingAlgorithm;

import java.lang.reflect.Method;
import java.util.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinearSearch {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void linearSearch() {
		int arr[] = {20,10,30,2,7,90};
		int search = 30;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println(search+" Element found in array at index "+i);
				break;
			}
		}
	}
}
