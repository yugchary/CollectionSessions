package MapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//stores values in the form of <key, Value>
		//key is stored in the form of Object
		//Each an every Object in java represent by a code, called HashCode
		//it is a 32-digit signed integer
		//key-->Object-->HashCode --> value
		//it contain only unique values, if added it ignores
		//null key and null value is NOT allowed, never define it -> null pointer exception
		//HashTable is synchronised
		//its thread safe - parallel execution NOT possible
		
		
		Hashtable h1 = new Hashtable<>();
		h1.put(1, "one");
		h1.put(2, "two");
		h1.put(3, "three");
		
		
		//create a clone --> copy/shallow copy:
		
		Hashtable h2 = new Hashtable<>();
		
		h2 = (Hashtable) h1.clone();
		
		System.out.println("values from h1 "+h1);
		System.out.println("values from h2 "+h2);
		
		h1.clear();
		System.out.println("values from h1 "+h1);
		System.out.println("values from h2 "+h2);
		
		System.out.println("key contains" + h2.containsKey(1));
		System.out.println("value contains" + h2.containsKey(1));
		
		
		System.out.println("******");
		
		//print all the values in a Hashtable - Enumeration -> elements method
		
		Enumeration e = h2.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all the values using entryset		
		Set s = h2.entrySet();
		
		System.out.println(s);
		
		
		//clone the Hashtable objects
		h1 = (Hashtable) h2.clone();		
		System.out.println("compare Hash table objs "+ h1.equals(h2));
		
		//get the value of the key		
		System.out.println("get key value h1->1->: " + h1.get(1));
		
		
		//get hash code of the Hashtable Object
		System.out.println("Hash code of h1 object: "+ h1.hashCode());
		

	}

}
