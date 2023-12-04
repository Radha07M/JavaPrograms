package CollectionsPrograms;

import java.util.*;

import org.testng.annotations.Test;

public class RemoveDuplicateElements {
	@Test
	public void removeDuplicates() {
		int[] arr = {1,2,2,3,2,4,5,6,7,8,6};
		
		List<Integer> list1 = new ArrayList<Integer>(arr.length);
		for(int i : arr) {
			list1.add(i);
		}
		Set<Integer> set = new HashSet<Integer>(list1);
		System.out.println(set);
	}
}
