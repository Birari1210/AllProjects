package CollectionAsingment17oct;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateInListAss3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      List<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(50);
      list.add(40);
      list.add(40);
      list.add(20);
      list.add(40);
      list.add(60);
      list.add(60);
		
		for (int i = 0; i <list.size(); i++)
		{
			for (int j=i+1; j<list.size(); j++) 
			{
				if(list.get(i)==list.get(j))
				{
					list.remove(i);
				}
				
			}
		}
		list.sort(null);
		System.out.println("list = "+list);	
	}
//use sort
}
