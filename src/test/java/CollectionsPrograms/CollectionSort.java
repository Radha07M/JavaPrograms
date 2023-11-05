package CollectionsPrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.*;

public class CollectionSort {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void sortGivenSentence() {
		String str = "Excellent experience of Selenium concepts - Selenium WebDriver, Locators, WebElement Function, Junit, TestNG, Alert, Actions Class, Window Handler";
		String[] str2 = str.split("-");
		String str4 = str2[1].trim();
		String[] strArr = str4.split(", ");
		
		List<String> list = new ArrayList<String>();
		for(String s:strArr) {
			list.add(s);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		List<String> list2 = Arrays.asList(strArr);
		Collections.sort(list2);
		System.out.println(list2);
	}
}
