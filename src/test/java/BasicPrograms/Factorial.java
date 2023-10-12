package BasicPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Find a factorial of a given number
 */
public class Factorial {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	//input= 1/1! + 2/2! + 3/3! + 4/4! + 5/5!
	//Output : 2.70833
	public void factorial() {
		int n=5;
		float fact=1;
		float Sum=0.0f;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			Sum=Sum+(i/fact);
		}
		
		System.out.printf("\n%.5f",Sum);
	}
	
	@Test
	//input= 1! + 2! + 3! + 4! + 5!
	//Output : 153.00000
	public void factorialSum() {
		int n=5;
		float fact=1;
		float Sum=0.0f;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			Sum=Sum+fact;
		}
		
		System.out.printf("\n%.5f",Sum);
	}

}
