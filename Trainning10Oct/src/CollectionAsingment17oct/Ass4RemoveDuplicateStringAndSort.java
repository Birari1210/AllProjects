package CollectionAsingment17oct;

import java.util.ArrayList;

public class Ass4RemoveDuplicateStringAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al= new ArrayList<>();
        al.add(0, "akash");
        al.add(1,"rakesh");
        al.add(2,"rakesh");
        al.add(3,"jay");
        al.add(4,"ankush");
        al.add(3,"jay");
        
        
        for (int i = 0; i < al.size(); i++)
        {
            for (int j = i+1; j < al.size(); j++)
            {
                if(al.get(i).equals(al.get(j)))
                {    
                 al.remove(j);
                 j--;
                }
            }
        }
        
    for (int i = 0; i < al.size(); i++)
        {
            for (int j = i+1; j < al.size(); j++)
            {
                if(al.get(i).compareTo(al.get(j))<0)
                {    
                 String temp=al.get(i);
                 al.set(i, al.get(j));
                 al.set(j, temp);
                }
            }
        }
    
    System.out.println("decending sort "+al);
    for (int i = 0; i < al.size(); i++)
    {
        for (int j = i+1; j < al.size(); j++)
        {
            if(al.get(i).compareTo(al.get(j))>0)
            {    
             String temp=al.get(i);
             al.set(i, al.get(j));
             al.set(j, temp);
            }
        }
    }
    System.out.println("Acending sort  "+al);
   
        
	}

}
