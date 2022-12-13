package java8Assingment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageMarksAss1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> marksList = new ArrayList<>();
		
		System.out.println("Enter Marks of Student");
		for (int i=0;i<6;i++)
		{
			marksList.add(sc.nextInt());
				
		}
		double Marks = marksList.stream().collect(Collectors.averagingDouble(stud->stud));
		System.out.println("Average marks of Student "+Marks);
		
	}

}
