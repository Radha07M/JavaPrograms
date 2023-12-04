package CollectionsPrograms;

import java.util.*;

import org.testng.annotations.Test;

public class CompareTwoHashMaps {
	@Test
	public void compareTwoMaps() {
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		map1.put(1,10);
		map1.put(2,20);
	
		Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		map2.put(1,20);
		map2.put(2,30);
		
		Set<Integer> set1 = new HashSet<Integer>(map1.values());
		Set<Integer> set2 = new HashSet<Integer>(map2.values());
		System.out.println("Map1 and Map2 VALUES are equals = "+set1.equals(set2));
		
		System.out.println("Map1 and Map2 KEYS are equals = "+map1.keySet().equals(map2.keySet()));
		
		System.out.println("Map1 and Map2 ENTRIES are equals = "+map1.equals(map2));
	}
}
