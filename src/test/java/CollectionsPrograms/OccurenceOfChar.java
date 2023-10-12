package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.*;

/*
 * Find a no. of occurrence of each character in given String
 */
public class OccurenceOfChar {

	@Test
	public void OccurenceOfCharacter() {
		String str="Selenium Tutorials";
		char[] strArr=str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch:strArr) {
			if(map.get(ch)!=null) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		map.remove(' ');
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
