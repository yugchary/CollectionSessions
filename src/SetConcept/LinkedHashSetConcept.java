package SetConcept;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetConcept {

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("four");
		ls.add("five");
		
		
		//print all
		System.out.println("print all values");
		System.out.println(ls);
		
		System.out.println("adv for loof");
		for(String s:ls)
			System.out.println(s);
		
		//iterator
		Iterator<String> i = ls.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
