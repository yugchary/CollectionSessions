package MapConcept;

import java.util.HashMap;

import java.util.Map.Entry;

import ListConcept.Employee;

public class HashMapConcept {
	
	public static void main(String[] args) {
		
		//HashMap ia a class, implements Map Interface
		//extends AbstractMap class
		//stores values in <key, value> pair
		//it does not preserve the insertion order.
		//it contains only unique values
		//can contain single/multiple null values
		//HashMap is non-synchronised (in parallel), it will be accessed by multiple threads. allowing for faster execution
		//fail fast condition - concurrently if any thread modified the map structure, "concurrent modification exception"
		//to improve performance, in multi thread environment we use HashMap
		
		
		
		HashMap<Integer, String> ec = new HashMap<Integer, String>();
		
		ec.put(200, "OK");		
		ec.put(401, "authentication error");
		ec.put(402, "service no found");		
		ec.put(404, "Not found");
		ec.put(500, "Internal Server Error");
		
		
		for(int i=0; i<ec.size(); i++)		//returns null
			System.out.println(ec.get(i));
		
		for(Entry m: ec.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
		System.out.println(ec);
		
		//it will remove the key completely, it will not shift the key
		System.out.println("removed 401");
		ec.remove(401);
		System.out.println(ec);
		
		HashMap<Integer, MapConcept.Employee> emp = new HashMap<Integer, MapConcept.Employee>();
		
		MapConcept.Employee e1= new MapConcept.Employee("Yug", 25, "QA");	
		MapConcept.Employee e2= new MapConcept.Employee("abhi", 12, "RnD");
		MapConcept.Employee e3= new MapConcept.Employee("akki", 8, "PM");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		
		//traverse the HashMap
		for(Entry<Integer, MapConcept.Employee> m: emp.entrySet()) {
			int i = m.getKey();
			MapConcept.Employee e = m.getValue();
			
			System.out.println(i + ">" + e.name + " "+ e.dept + " " + e.age);
		}
		
		/*HashMap object name is emp.entrySet()
		Entry is representing m and M is part of <integer, Employee>
		getkey() will return integer
		m.getValue() will return all employees. 
		emp.entrySet() will be stored in this perticular m.
		m.getvalue() is stored in e

		"Entry" Set we are using, it is an interface, which is used to traverse hash map.*/
		
	}

}
