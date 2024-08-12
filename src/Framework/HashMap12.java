package Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMap12 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		
		hm.put(1, "madhu");
		hm.put(2, "chandu");
		
		System.out.println("iterating elements...");
		for (Map.Entry m: hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			
			
		}
	}

}
