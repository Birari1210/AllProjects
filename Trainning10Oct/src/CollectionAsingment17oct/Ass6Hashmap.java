package CollectionAsingment17oct;

import java.util.HashMap;
import java.util.TreeMap;

public class Ass6Hashmap {

	public static void main(String[] args) {

		HashMap<String, Integer> map= new HashMap<>();
        map.put("dhule", 12000);
        map.put("jalgaon", 1000);
        map.put("pune",9000);
        map.put("delhi", 6500);
        map.put("chennai", 4400);
        
        TreeMap<String, Integer> tree=new TreeMap<>();
        tree.putAll(map);
        System.out.println(tree);
		
	}

}
