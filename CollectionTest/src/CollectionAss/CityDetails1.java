package CollectionAss;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CityDetails1 {
	
	public static void main(String[] args) {
				
		List<City>  cl = new ArrayList<City>();
		cl.add(new City("pune", 22000, 4500));
		cl.add(new City("mumbai", 455000, 6000));
		cl.add(new City("Nashik", 30000, 7800));
		cl.add(new City("Nagpur", 31000, 4300));
						
		City cname = cl.stream().max((a,b)->a.area > b.area ?1:-1).get();
		System.out.println("Highest population city is : "+cname.name);
		
		Set<Long> populationSet = cl.stream().map(p->p.population).collect(Collectors.toSet());
		System.out.println("Set Of Population "+populationSet);
		
		City leastArea = cl.stream().min((a,b)->a.area>b.area ?1:-1).get();
		System.out.println("Filter city With Area is : "+leastArea.name);
    }
}
