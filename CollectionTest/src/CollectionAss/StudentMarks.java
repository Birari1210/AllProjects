package CollectionAss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMarks {

	public static void main(String[] args) {
		
		List<Student1> list = new ArrayList<Student1>();
		
		list.add(new Student1(1, 30, "raj"));
		list.add(new Student1(2, 50, "Jayesh"));
		list.add(new Student1(3, 60, "Manoj"));
		list.add(new Student1(4, 40, "Lucky"));

		double avg = list.stream().collect(Collectors.averagingInt(s1->s1.marks));
		System.out.println("Total Marks Avarage is "+avg);
		
	}
}


