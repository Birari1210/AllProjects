package LambdaExpression;

public class Student {

	String name;
	int id;
	int age;

	
	

	public Student() {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) throws AgeInValidException {
		
		if(age< 18)
		{
			throw new AgeInValidException("Enter age is greater than 18");
		}
		else
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}


	public static void main(String[] args) {

		Student s = new Student();
		
		s.setName("Prasad");
		
		s.setId(1);
		
		try {
			s.setAge(19);
			System.out.println("age "+s.getAge());
		} 
		catch (AgeInValidException e) {
			System.out.println(e.message);
			e.printStackTrace();
		}
		
		System.out.println(s);

	}

}
