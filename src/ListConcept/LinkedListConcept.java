package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		System.out.println(ll.size());
		
		System.out.println("****");
		
				
		ll.addFirst(0);
		ll.addLast(4);
		
		for(int i=0; i<ll.size(); i++)
			System.out.println(ll.get(i));
		
		System.out.println("**adv for loop**");
		
		//advanced for loop
		for(int i :ll) {
			System.out.println(i);
		}
		
		//traverse the LinkedList
		System.out.println("**using iterator**");
		
		Iterator<Integer> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		System.out.println("**while**");
		
		int num=0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		

	}

}
