package com.training.lambda;

@FunctionalInterface
interface Dog
{
	void bark();
}
@FunctionalInterface
interface Printer
{
	void print(String name,int time);
}
interface Checker
{
	boolean check();
}
@FunctionalInterface
interface Calcultor
{
	int calc(int a, int b);
}
public class LambdaDemo {

	public static void main(String[] args) {

		Dog d1=()->{System.out.println("Dog is barking"); };
		
		Printer p1=(s,t)->{for(int i=1;i<=t;i++){System.out.println(" "+s);}};
		
		d1.bark();
		p1.print("prasad",3);
		
		
		Calcultor add =(a,b)-> a+b;
		Calcultor sub =(a,b)-> a-b;
		Calcultor mul =(a,b)-> a*b;
		Calcultor div =(a,b)->{return a/b; };
		
		System.out.println(add.calc(20,10));
		System.out.println(sub.calc(20,10));
		System.out.println(mul.calc(20,10));
		System.out.println(div.calc(20,10));
		
		int arr[] = {10 ,12 ,3 ,4,5,6,17,16,20};
		Checker c1 =(d)->d<10?true:false;
		for (int d : arr) 
		{
			if(c1.check(d))
			{
			System.out.println(d+" ");	
			}
		}
	}

}
