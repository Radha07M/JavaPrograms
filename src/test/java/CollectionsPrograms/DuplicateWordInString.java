package CollectionsPrograms;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DuplicateWordInString {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void duplicateWordInString() {
		String s="This is a selenium interview selenium";
		String str[]=s.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s1:str){
			if(map.get(s1)!=null){
				map.put(s1,map.get(s1)+1);
			}
			else {
				map.put(s1, 1);
			}
		}		
		for(Map.Entry<String, Integer> map1:map.entrySet()) {
			if(map1.getValue()>=2) {
				System.out.println(map1.getKey()+" "+map1.getValue());
			}
		}	
	}
}
