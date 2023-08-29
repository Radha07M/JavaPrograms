package CollectionsPrograms;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		String str="I am confident. I have to be confident whether you have knowledge or not. Never loose your confident. Never give up";
		String[] wordArr = str.split(" ");
		
		List<String> list = new ArrayList<String>();
		for(String word:wordArr) {
			list.add(word);		///Add data into list
		}
		System.out.print("\nAdded String into list using add() ");
		
		list.add(null);
		list.add(null);
		System.out.println("Added null values in list=> "+list);
		
		System.out.print("Access Data from List 1 Way- for(String data:list): =>");
		for(String data:list) {		//Access and display data in this way
			System.out.print(data+" ");
		}
		
		System.out.print("\nAccess Data from List 2 Way- using iterator():=> ");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){		//Access and display data in this way
			System.out.print(itr.next()+" ");
		}
		
		System.out.print("\nAccess Data from List 3 Way- using listIterator(): =>");
		ListIterator<String> ltItr=list.listIterator();
		while(ltItr.hasNext()){		//Access and display data in this way
			System.out.print(ltItr.next()+", ");
		}
		
		System.out.print("\nAccess Data from List 4 Way- using get(index) in normal for loop: =>");
		for(int i=0;i<list.size();i++){		//Access and display data in this way
			System.out.print("("+i+" = "+list.get(i)+"); ");
		}
		System.out.println("\n---------------------------------\n");
		
		//Find first index of given work
		int idx = list.indexOf("confident");
		System.out.println("Index of confident using indexOf()=> "+idx);
		
		//Find last index of given work
		idx = list.lastIndexOf("Never");
		System.out.print("Last index of Never using lastIndexOf()=> "+idx);
		
		System.out.println("\n---------------------------------\n");
		
		//update never to Dont
		list.set(idx, "Dont");
		System.out.print("Update data (Never to Dont) for index- "+idx+" - in list using set()=> "+ list);
		System.out.println("\n---------------------------------\n");
		
		//Check whether object present in the list or not
		if(list.contains("confident")) {
			System.out.println("Verified confident word is present in the list using contains()");
		}
		else {
			System.out.println("Verified confident word is not present in the list using contains()");
		}
		System.out.println("---------------------------------\n");
		
		//Add all elements from  one collection object to other collection object
		LinkedList<String> linkedlst = new LinkedList<String>();
		linkedlst.addAll(list);
		System.out.println("Added list data into Linked List using addAll()=> "+linkedlst);
		
		//Check whether both objects or elements are equals or not
		if(linkedlst.equals(list)) {
			System.out.println("Verified both list elements are same using equals()");
		}
		
		List<String> subList = linkedlst.subList(3, 8);
		System.out.println("Created subList from list using subList()=> "+subList);
		
		//Remove all given list of elements from list.
		linkedlst.removeAll(list);
		System.out.println("Remove all elements from the list=> "+linkedlst);
		System.out.println("---------------------------------\n");
		
		Stack<String> stack = new Stack<String>();
		stack.addAll(list);
		System.out.println("Added list data into Stack using addAll()=> "+stack);
		
		stack.pop();
		System.out.println("Deleted last element from stack using pop()=> "+stack);
		
		stack.push("null");
		System.out.println("Added element into stack end using push()=> "+stack);
		System.out.println("---------------------------------\n");	
		
		//Remove given element
		list.remove("not.");
		System.out.println("Removed a element from list=> "+list);		
		
		//Remove given index element
		list.remove(12);
		System.out.println("Remove single elements from list=> "+list);
		
		//Remove all elements from list but nor delete the list container
		list.clear();
		System.out.println("Remove all elements from list but not delete list container=> "+list);
		
		//Check list is empty or not
		if(list.isEmpty()) {
			System.out.println("Checked list is empty using isEmpty()");
		}
		System.out.println("---------------------------------\n");
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(30);
		list1.add(50);
		list1.add(20);
		list1.add(40);
		list1.add(80);
		list1.add(30);
		
		//forEach method in list
		System.out.print("Access Data using Lambda Expression=> ");
		list1.forEach((el)-> System.out.print(el+ " "));
		
		list1.removeIf(n -> (n<=20));
		System.out.print("\nRemoved elements which is less <= 20 from List using removeIf()-> "+list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(60);
		list2.add(30);
		System.out.println("\nCreated list2 and elements are=> "+list2);
		list2.retainAll(list1);
		System.out.println("Take all common elements from list1 & list2 using retainAll()=> "+list2);
		
		Object[] OArr = list1.toArray();
		System.out.print("Object[] => ");
		for(Object in : OArr) {
			System.out.print(in+" ");
		}
		
		Integer[] arr = new Integer[list1.size()];
		arr = list1.toArray(arr);
		System.out.print("\nInteger[] elements=> ");
		for(Integer in : arr) {
			System.out.print(in+" ");
		}
	}
}
