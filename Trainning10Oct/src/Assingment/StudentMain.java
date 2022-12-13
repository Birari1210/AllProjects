package Assingment;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1, "Prasad ", "prasad@123","nil");
		Student s2 = new Student(2, "Jay ", "jay@123","nil");
		
		s1.teacher="anil";
		System.out.println(s1);
		
		System.out.println(s2.add(12, 140));
		
		
		//System.out.println(s2);
		
		Student s3[] = new Student[3];
		s3[0]= new Student(1,"prasad","prasad@111","nilesh");
		s3[1]= new Student(2,"raj","raj@123","dev");
		s3[2]= new Student(3,"jay","Jay@2343","nilesh");
		
		System.out.println(s3[1].getName());

	}

}
