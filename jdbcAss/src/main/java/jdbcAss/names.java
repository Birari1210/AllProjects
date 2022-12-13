package jdbcAss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> names1 = new ArrayList<String>(); 
		 names.add("Mahesh "); 
		 names.add("Suresh "); 
		 names.add("Ramesh ");
		 names.add("Naresh "); 
		 names.add("Kalpesh ");
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

		System.out.prinltn(names);



	}

}
