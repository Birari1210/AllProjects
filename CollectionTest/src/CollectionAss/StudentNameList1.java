package CollectionAss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentNameList1 
{
		public static void main(String[] args) 
		{		
	    List<String> names =Arrays.asList("raj","akshay","jay","ajay","Prasad","rahul");
		List<String> stuname = names.stream().filter(p->p.startsWith("a")).collect(Collectors.toList());
		System.out.println(stuname);
		}
}



