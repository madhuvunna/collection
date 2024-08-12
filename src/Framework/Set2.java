package Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class Set2 {

	public static void main(String[] args) {
		 TreeSet<String> al=new TreeSet<String>();  
		  al.add("Vijay");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
