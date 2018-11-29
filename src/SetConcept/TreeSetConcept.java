package SetConcept;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		
		
		Set<String> ts= new TreeSet<String>();
		
		ts.add("one");
		ts.add("two");
		ts.add("three");
		ts.add("four");
		ts.add("five");
		
		
		//print all
		System.out.println("print all values");
		System.out.println(ts);
		
		System.out.println("adv for loof");
		for(String s:ts)
			System.out.println(s);
		
		//iterator
		Iterator<String> i = ts.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ArrayList<String> ar= new ArrayList<String>(ts);
		
		System.out.println(ar.get(3));
		

	}

}
