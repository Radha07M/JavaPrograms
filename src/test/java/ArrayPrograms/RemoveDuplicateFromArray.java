package ArrayPrograms;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Remove Duplicate element from array
 */
public class RemoveDuplicateFromArray {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void RemoveDuplicateElementFromArray() {
		int[] arr = {10,2,7,3,2,7,1};
		
		Arrays.sort(arr);
		
		int[] result = new int[arr.length];
		int previous = arr[0];
		result[0]= previous;
		
		for(int i=0;i<arr.length;i++) {
			int ele = arr[i];
			if(previous != ele) {
				result[i]=ele;
			}
			previous=ele;
		}
		
		System.out.print("After Removed duplicates: ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
	}
	
	@Test
	public void RemoveDupEleFrom2DArray() {
		int[][] arr2D= {{1,1,6,2,5,6,3},{11,8,4,2,4,6,6},{1,1,1,2,3,9,3},{1,1,1,1,5,6,3}};
		
		for(int[] arr:arr2D) {
			System.out.println("Array before removing duplicates: "+Arrays.toString(arr));
			System.out.println("Array After removing duplicates: "+Arrays.toString(RemoveDuplicates(arr)));			
		}
	}
	public static int[] RemoveDuplicates(int[] arr){
		Arrays.parallelSort(arr);
		int previous = arr[0];
		int[] result = new int[arr.length];
		result[0]=previous;
		
		for(int i=0;i<arr.length;i++) {
			int ele = arr[i];
			if(previous != ele) {
				result[i]=ele;
			}
			previous=ele;
		}
		return result;
	}
}
