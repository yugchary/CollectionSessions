package SetConcept;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {
	
		//List allows duplicate, set does not allow
		//List is ordered collection (insertion order is preserved), Set is un-ordered collection
		//List works on indexing which is slow, compared to hash technique in Set
	
	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		
		//print all
		System.out.println("print all values");
		System.out.println(hs);
		
		System.out.println("adv for loof");
		for(String s:hs)
			System.out.println(s);
		
		//iterator
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
