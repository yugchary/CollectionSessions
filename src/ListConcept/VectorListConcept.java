package ListConcept;

import java.util.ListIterator;
import java.util.Vector;

public class VectorListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. take a vector to store Integer objects
		//2. Vector is synchronized that means at a time only one thread can access the code 
		//3. Being synchronized means that every operation is thread safe
		
        Vector<Integer> v = new Vector<Integer>();
 
        // Adding Elements to Vector
        v.add(10);
        v.add(20);
        v.add(30);
 
        // Creating a ListIterator
        ListIterator lit = v.listIterator();
        System.out.println("In Forward direction:");
 
        while (lit.hasNext())
            System.out.print(lit.next()+" ") ;
 
        System.out.print("\n\nIn backward direction:\n") ;
        while (lit.hasPrevious())
            System.out.print(lit.previous()+" ");
        
        

	}

}
