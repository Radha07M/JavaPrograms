package CollectionsPrograms;

import java.util.*;

import org.testng.annotations.Test;

public class SetMethods {

	@Test
	public void setMethods() {
		String str="I am confident. Dont give up";		
		String arrStr[] = str.split(" ");
		
		Set<String> setCol = new HashSet<String>();
		for(String s1:arrStr) {
			setCol.add(s1);
		}
		System.out.println("Set elements(unordered and unique)=> "+setCol);
		
		Set<String> setCol2 = new HashSet<String>();
		setCol2.add("50");
		setCol2.add("30");
		setCol2.add("70");
		setCol.addAll(setCol2);
		System.out.println("Added other set2 into set1 using addAll()=> "+setCol);
		
		if(setCol.contains("up")) {
			System.out.println("Verify given elements is present in the set using contains()");
		}
	}
}
