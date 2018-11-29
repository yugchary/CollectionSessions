package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3];	//static array
		
		
		//dynamic arrays
		//1. can contain duplicate values
		//2. maintains insertion order
		//3. allows random access to fetch data, using index
		//5. arrayList is not synchronized that means multiple threads can work on arrayList at same time
		//6. Being synchronized means that every operation is thread safe 
		
		
		ArrayList ar = new ArrayList();
		
		//ar.add(11); //0
		ar.add("A"); //1
		ar.add("selenium"); //3
		
		System.out.println("size of array "+ar.size());
		
		ar.add("2.3");	//4
		ar.add("##");	//5
		ar.add(1);	//6
		ar.remove(1);
		
		System.out.println("size of array "+ar.size());
		
		//to print values we used
		//1. for loop
		//2. iterator
		
		for(int i =0; i< ar.size(); i++)
			System.out.println(ar.get(i));
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();	//generic concept
		
		ar1.add(11);
		ar1.add(22);
		ar1.add(33);
		
		
		ArrayList<E> ar2 = new ArrayList<E>();	//if we are not sure of the  data type
		
		//Employee class objects:
		Employee e1 = new Employee("yug", 25, "QA");
		Employee e2 = new Employee("abhi", 10, "SE");
		Employee e3 = new Employee("akki", 8, "PO");
		
		//Create ArrayList
		//1. in generics we can store primitive, non-primitive and class object also
		
		
		ArrayList <Employee> emp = new ArrayList<Employee>();
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		
		for(int i =0; i< emp.size(); i++)
			System.out.println(emp.get(i).name + " " + emp.get(i).age + " " + emp.get(i).dept);
		
		
		//traverse user iterator
		
		Iterator<Employee> it = emp.iterator();
		
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.dept);
			
		
			
			
			
		}
		
		
		
		System.out.println("*********");
		
		
		//addall() 	//to copy from one array list to other array
		
		ar.addAll(ar1);
		
		for(int i =0; i< ar.size(); i++)
			System.out.println(ar.get(i));
		
		//retainAll() //only the common b/n with array list
		
		System.out.println("********");
		
		ar.retainAll(ar1);
		
		for(int i =0; i< ar.size(); i++)
			System.out.println(ar.get(i));
		
	}

}
