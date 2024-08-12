package Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("madhu");
		al.add("chandu");
		al.add("sushmitha");
		al.add("amma");

		Collections.sort(al);
		for (String string : al) {
			System.out.println(string);

			System.out.println("sorting numbers...");

			ArrayList<Integer> al2 = new ArrayList<Integer>();
			al2.add(21);
			al2.add(23);
			al2.add(25);
			al2.add(27);

			Collections.sort(al2);

			for (Integer integer : al2) {
				System.out.println(integer);
			}
		}
	}
}
