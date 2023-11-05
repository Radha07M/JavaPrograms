package ArrayPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.*;

public class SumOfArrayNumbers {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void sumOfArrayNum() {
		int[] arr = {10,40,20,5,90,1};
		int sum=0;
		for(int num : arr) {
			sum+=num;
		}
		System.out.println("Sum= "+sum);
	}
}
