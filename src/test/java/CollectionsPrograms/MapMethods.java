package CollectionsPrograms;

import java.lang.reflect.Method;
import java.util.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MapMethods {
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test
	public void mapMethods() {
		String str = "Dont stop till your goal is achieve. Dont give up. I am Confident. I am Confident.";
		String[] strArr = str.split(" ");
		
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		for(int i=0;i<strArr.length;i++) {
			map1.put(strArr[i],i);
		}
		System.out.println("Display Data=> "+map1);
		System.out.println("Display Data using entrySet()=> "+map1.entrySet());
		System.out.println("Map size is=> "+map1.size());
		
		map1.remove("is");
		System.out.println("Removed is using remove()=> "+map1);
		
		map1.remove("achieve.",6);
		System.out.println("Removed achieve. using remove()=> "+map1);
		
		System.out.println("Map size is=> "+map1.size());
		
		if(map1.containsKey("Dont")) {
			System.out.println("Value of key \'Dont\' using get()-> "+map1.get("Dont"));
		}
		
		System.out.println("Is the Key goal present in the map using containsKey()-> "+map1.containsKey("goal"));
		System.out.println("Is the Key radha present in the map using containsKey()-> "+map1.containsKey("radha"));
		
		System.out.println("Is the value 2 present in the map using containsValue()-> "+map1.containsValue(2));
		System.out.println("Is the value 10 present in the map using containsValue()-> "+map1.containsValue(10));
				
		for(Map.Entry<String, Integer> entry:map1.entrySet()) {
			System.out.println("using getKey() key= "+entry.getKey()+", using getValue() value= "+entry.getValue());
		}
		
		System.out.println("\n\nString=> "+str);
		int count=1;
		Map<String,Integer> map2 = new HashMap<String, Integer>();
		for(int i=0;i<strArr.length;i++) {
			if(map2.containsKey(strArr[i])) {
				map2.put(strArr[i], count+1);
			}
			else {
				map2.put(strArr[i],count);
			}
		}
		System.out.println("Map size is=> "+map2.size());
		
		System.out.println("Find no of occurence of key: "+map2);
		
		System.out.println("is both map1 and map2 equal=> "+map1.equals(map2));
		
		Set<String> keySet1 = new HashSet<String>();
		keySet1=map2.keySet();
		System.out.println("Key set of map2 using keySey()=> "+keySet1);
		
		Set<String> keySet2 = new HashSet<String>();
		keySet2=map1.keySet();
		System.out.println("Key set of map1 using keySey()=> "+keySet2);
		
		Map<String,Integer> map3 = new HashMap<String, Integer>();
		map3.putAll(map1);
		System.out.println("Added all elements from map1 to map3 using putAll()=> "+map3);
		
		map3.putIfAbsent("Radha", 1);
		System.out.println("Added key and value if absent using putIfAbsent()=> "+map3);
		
		map1.clear();
		System.out.println("Removed all elements: "+map1);
	}
}
