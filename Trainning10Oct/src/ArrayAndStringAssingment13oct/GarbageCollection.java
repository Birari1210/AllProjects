package ArrayAndStringAssingment13oct;

//7 WAP to demonstrate how garbage collector work when any memory is not referenced by string object.
public class GarbageCollection {

	public void finalize()
	{
		System.out.println("garbage collected");
	}
	
	public static void main(String[] args) {

		GarbageCollection s1 = new GarbageCollection();
		System.out.println(s1.hashCode());
		s1=null;
		System.gc();
		
	}

}
