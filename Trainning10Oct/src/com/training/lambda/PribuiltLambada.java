package com.training.lambda;

import java.util.function.Function;

public class PribuiltLambada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Integer> square =(a)->a*a;
		int arr[]= {1,2,3,4,5};
		
		for(int a : arr)
		{
			System.out.println(square.apply(a));
		}
	}

}
