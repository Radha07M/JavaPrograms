package ArrayPrograms;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CopyArray {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void copyOneArraytoAnother() {
		int[] sourceArr = {1, 2, 3, 4, 5, 6};
		//1. Copying Arrays Using Assignment Operator
		int[] destinationArr = sourceArr;
		
		System.out.print("Method1: ");
		for(int num : destinationArr) {	//Array content display way1
			System.out.print(num+" ");
		}
		System.out.println();
		
		//2. Using Looping Construct to Copy Arrays
		int[] destiArr2= new int[sourceArr.length];
		for(int i=0; i<sourceArr.length; i++) {
			destiArr2[i]=sourceArr[i];
		}
		System.out.println("Method2: "+Arrays.toString(destiArr2)); //Array content display way2
		
		//3. Copying Arrays Using arraycopy() method
		int[] destiArr3= new int[sourceArr.length];
		//copy whole data from one array to another
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(sourceArr, 0, destiArr3, 0, sourceArr.length);
		System.out.println("Method3: "+Arrays.toString(destiArr3));
		
		int[] destiArr4= new int[4];
		//Copy partial data of source to destination array
		System.arraycopy(sourceArr, 2, destiArr4, 0, 4);
		System.out.println("Method3 partial: "+Arrays.toString(destiArr4));
		
		//4. Copying Arrays Using copyOfRange() method
		int[] destiArr5 = Arrays.copyOfRange(sourceArr, 0, sourceArr.length);
		System.out.println("Method4: "+Arrays.toString(destiArr5));
		
		int[] destiArr6 = Arrays.copyOfRange(sourceArr, 2, 5);
		System.out.println("Method4 partial: "+Arrays.toString(destiArr6));	
	}
}
