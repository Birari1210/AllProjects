package Assingment;

public class Student {
	
	private int id;
	private String name;
	private String email;
	protected  static String teacher;
	
	public Student(int id, String name, String email, String teacher) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.teacher = teacher;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getTeacher() {
		return teacher;
	}

	public static void setTeacher(String teacher) {
		Student.teacher = teacher;
	}
	
	public int add(int a, int b)
	{
		System.out.println("jay");
		return a+b;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ",teacher=" + teacher +"]";
	}

	
 

//	public static void main(String[] args) {
//		Student s1[] = new Student[3];
//		s1[0]= new Student(1,"prasad","prasad@111","nilesh");
//		s1[1]= new Student(2,"raj","raj@123","dev");
//		s1[2]= new Student(3,"jay","Jay@2343","nilesh");
//		
//		System.out.println(s1[1].getName());
//		
//	}
//  

	

	


	
	
//	public static void main(String[] args) {
//		
//	}


	

	
	
}
