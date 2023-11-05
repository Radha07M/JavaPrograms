package StringPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Swap2String {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void swap2StringWithoutTempVar(){
		String str1="Test1";
		String str2="Test2";
		System.out.println("Before swapping: "+str1+" "+str2);
		
		int length = str1.length();		
		str1=str1+str2; 
		System.out.println("After merging String: "+str1);
		
		str2=str1.substring(0,length);
		int length2= str1.length();
		str1=str1.substring(length, length2);
		System.out.println("After swapping: "+str1+" "+str2);
	}
	
	@Test
	public void swap2StringWithTempVar(){
		String str1="Test1";
		String str2="Test2";
		System.out.println("Before swapping: "+str1+" "+str2);
		
		String temp=str1;
		str1=str2;
		str2=temp;
		System.out.println("After swapping: "+str1+" "+str2);
	}
}
