package CollectionAsingment17oct;

import java.util.ArrayList;
import java.util.List;

public class Ass1SortAscending {

	public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
		
        list.add(70);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(60);
        
		list.sort(null);
		
		for (Integer in: list) {
			System.out.println(in);
			
			
		}

	}

}
