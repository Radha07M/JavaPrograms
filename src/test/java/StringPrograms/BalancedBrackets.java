package StringPrograms;

import java.util.*;

import org.testng.annotations.Test;

/*
 * LIFO - Last In First Out
 */
public class BalancedBrackets {
	@Test
	public void BalanacedBrackets1() {
		String str = "{[]()}";
		char check;
		boolean flag = true;
		Deque<Character> stack = new ArrayDeque<Character>();
		for(char ch:str.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
				continue;
			}
			if(stack.isEmpty())
				flag = false;
			
			switch(ch) {
				case ')':
					check = stack.pop();
					if(ch=='{' || ch=='[') {
						break;
					}
				case '}':
					check = stack.pop();
					if(ch=='(' || ch=='[') {
						break;
					}
				case ']':
					check = stack.pop();
					if(ch=='{' || ch=='(') {
						break;
					}
			}
		}
		
		if(flag) {
			System.out.println("String is having balanced brackets");
		}
		else {
			System.out.println("String is not having balanced brackets");
		}
	}
}
