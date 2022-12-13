package com.training.lambda;

public class MyThreadLambada {

	public static void main(String[] args) {

//		Runnable r1 =()->{
//			try {
//				for(int i=1;i<=10;i++)
//				{
//					System.out.println(i);
//					Thread.sleep(1000);
//				}
//			}catch(Exception e)
//				{
//					
//				}
//			};
//	
		Thread t1 = new Thread(()->{
			try {
				for(int i=1;i<=10;i++)
				{
					System.out.println(i);
					Thread.sleep(1000);
				}
			}
			catch(Exception e)
				{
					
				}
			}
	);
		t1.start();
	}

}
