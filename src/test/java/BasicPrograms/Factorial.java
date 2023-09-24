package BasicPrograms;

import org.testng.annotations.Test;

public class Factorial {

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
