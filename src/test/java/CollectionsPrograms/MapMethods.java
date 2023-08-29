package CollectionsPrograms;

import java.util.*;

public class MapMethods {
	public static void main(String[] args) {
		String str = "Dont stop till your goal is achieve. Dont give up. I am Confident. I am Confident.";
		String[] strArr = str.split(" ");
		
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		for(int i=0;i<strArr.length;i++) {
			map1.put(strArr[i],i);
		}
		System.out.println(map1);
		
		map1.remove("is");
		System.out.println(map1);
		map1.remove("achieve.",6);
		System.out.println(map1);
		
		if(map1.containsKey("Dont")) {
			System.out.println("Value of Dont is-> "+map1.get("Dont"));
		}
		
		for(Map.Entry<String, Integer> entry:map1.entrySet()) {
			System.out.println("Key= "+entry.getKey()+", value= "+entry.getValue());
		}
		
		map1.clear();
		System.out.println("Removed all elements: "+map1);
		
		System.out.println("\n\nString=> "+str);
		int count=1;
		for(int i=0;i<strArr.length;i++) {
			if(map1.containsKey(strArr[i])) {
				map1.put(strArr[i], count+1);
			}
			else {
				map1.put(strArr[i],count);
			}
		}
		System.out.println("Find no of occurence of key: "+map1);
		
	}
}
