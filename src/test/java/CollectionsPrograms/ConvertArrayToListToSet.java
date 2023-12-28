package CollectionsPrograms;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConvertArrayToListToSet {
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void ArrayToListToSet() {
		int arr[]={10,30,20};

		List<Integer> list1 = new ArrayList<Integer>();

		for(int i=0;i<arr.length;i++){
			list1.add(arr[i]);
		}

		Set<Integer> set1 = new HashSet<Integer>();

		set1.addAll(list1);
		
		System.out.println(set1);
	}
	
	@Test
	public void StringArrayToListToSet() {
		String str = "Excellent experience of Selenium concepts - Selenium WebDriver, Locators, WebElement Function, Junit, TestNG, Alert, Actions Class, Window Handler";
		String[] str2 = str.split("-");
		String str4 = str2[1].trim();
		String[] strArr = str4.split(", ");

		List<String> list1 = Arrays.asList(strArr);
		System.out.println(list1);
		
		Set<String> set1 = new HashSet<String>(list1); //OR 
		//set1.addAll(list1); //addAll
		System.out.println(set1);
	}
}
