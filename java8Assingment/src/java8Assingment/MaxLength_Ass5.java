package java8Assingment;

import java.util.ArrayList;
import java.util.List;

public class MaxLength_Ass5 {

	public static void main(String[] args) {

		String[] str = {"prasad","nilesh","rakesh","jaydeep"};
		List<Integer> cntList = new ArrayList<Integer>();
		for(String s: str)
		{
			int count=0;
			char[] arr = s.toCharArray();
			for(char ch : arr)
			{
				count++;
			}
			cntList.add(count);
		}
		Integer max = cntList.stream().max((a,b)->a>b?1:-1).get();
		System.out.println("Maximum Length of  is-"+max);
		
		}
			
	}

