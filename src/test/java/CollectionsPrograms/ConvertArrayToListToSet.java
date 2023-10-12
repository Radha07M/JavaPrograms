package CollectionsPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class ConvertArrayToListToSet {
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
}
