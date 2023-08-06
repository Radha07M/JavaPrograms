package StringPrograms;

import java.util.*;

public class DuplicateWord {
	/*public static void main(String[] args) {
		String str= "I am Radha I am Tester";
		int count;
		
		str = str.toLowerCase();
		
		String[] word=str.split(" ");
		
		for(int i=0;i<=word.length;i++) {
			count=1;
			for(int j=i+1;i<word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
			}
			if(count>1 && word[i]!="0") {
				System.out.println(word[i]);
			}
		}
	}*/
	
	public static void main(String[] args)
	{
	
		// we have a expression
		String expression= "Hi, I am Hritik and I am a programmer";
	
		// splitting words using regex
		String[] words = expression.split("\\W");
	
		// we are creating a Map for storing
		// strings and it's occurrence"
		Map<String, Integer> word_map = new HashMap<String, Integer>();
	
		// Here we are iterating in words array and
		// increasing it's occurrence by 1.
		for (String word : words) {
	
			if (word_map.get(word) != null) {
				word_map.put(word, word_map.get(word) + 1);
			}
	
			// if the word came once then occurrence is 1.
			else {
				word_map.put(word, 1);
			}
		}
	
		// creating a keyset of word_map
		Set<String> word_set = word_map.keySet();
	
		// We are iterating in word set
		for (String word : word_set) {
	
			// if word matched then checking occurrence
			if (word_map.get(word) > 1)
	
				// here we are printing the duplicate words
				System.out.println(word);
		}
	}
}
