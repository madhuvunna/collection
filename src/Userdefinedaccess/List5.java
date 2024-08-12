package Userdefinedaccess;

import java.util.ArrayList;
import java.util.Iterator;

public class List5 {

	public static void main(String[] args) {
		Student s1 = new Student(27, 25, "madhu", "durgamchervuvu");
		Student s2 = new Student(30, 23, "chandu", "jubilehillsroadno5");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.Address+" "+st.age+" "+st.rollno+" "+st.StudentName);
		}
	}

}
