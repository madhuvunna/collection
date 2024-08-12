package Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {

	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();

		li.add("madhu");
		li.add("chandu");
		li.add("sushmitha");
		li.add("amma");

		System.out.println("initial collection value:" + li);

		Collections.addAll(li, "akka", "bava");

		System.out.println("After adding elements collection value:" + li);
		String[] strArr = { "C#", ".Net" };
		Collections.addAll(li, strArr);
		System.out.println("After adding array collection value:" + li);
	}

}
