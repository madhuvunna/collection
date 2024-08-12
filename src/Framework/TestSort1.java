package Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("madhu");
		al.add("chandu");
		al.add("sushmitha");
		
		Collections.sort(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		 Collections.sort(al,Collections.reverseOrder());  
	        Iterator i=al.iterator();  
	        while(i.hasNext())  
	        {  
	            System.out.println(i.next());  
	        }  
	}

}
