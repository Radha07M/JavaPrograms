package WrapperClasses;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ObjectNumberToPrimitive {
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void convertObjectToPrimitive() {
		Integer wInterger = new Integer(10);
		int pInt = wInterger.intValue();
		System.out.println("Wrapper Integer Object converted to int: "+ pInt);
		
		Integer wInt = Integer.valueOf(pInt);
		System.out.println(wInt);
		
		long pLong = wInterger.longValue();
		System.out.println("Wrapper Integer Object converted to long: "+ pLong);
		
		Float wFloat = new Float(10.10);
		int pfloat = wFloat.intValue();
		System.out.println("Wrapper Float Object converted to int: "+ pfloat);
		
		float pfloat1 = wFloat.floatValue();
		System.out.println("Wrapper Float Object converted to float: "+ pfloat1);
		
		Double wDouble = new Double(10.10);
		double pDouble = wDouble.doubleValue();
		System.out.println("Wrapper Double Object converted to double: "+ pDouble);
		
		Double wDouble3 = Double.valueOf(wInterger);
		System.out.println("Wrapper Integer Object converted to Double Object: "+ wDouble3);
		
		Long wLong = new Long(23983);
		long plong1 = wLong.longValue();
		System.out.println("Wrapper Long Object converted  to long: "+ plong1);
		
		Character wCharacter = new Character('D');
		char pChar = wCharacter.charValue();
		System.out.println("Wrapper Character Object converted to char: : "+pChar);
		
		//This is not possible will give number format exception
		  String str= new String("10565");
		Integer wInt1 = Integer.valueOf(str);
		System.out.println("Wrapper String Object converted to Integer Onject: : "+wInt1);
		 
		
		char str1= 'X';
		String ch = String.valueOf(str1);
		
	}

}
