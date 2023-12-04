package CollectionsPrograms;

import java.util.*;

import org.apache.commons.collections4.map.HashedMap;
import org.testng.annotations.Test;

public class OccurenceOfNum {
	@Test
	public void CountOfEachDigitInNumber() {
		int num = 223455;
		Map<Integer, Integer> map = new HashedMap<Integer, Integer>();
		while(num!=0) {
			int rem = num%10;
			if(map.containsKey(rem)) {
				map.put(rem, map.get(rem)+1);
			}
			else {
				map.put(rem, 1);
			}
			num/=10;
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
	}
}
