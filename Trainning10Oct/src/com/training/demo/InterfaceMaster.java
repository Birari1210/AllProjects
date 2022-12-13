package com.training.demo;

public class InterfaceMaster {

	public static void main(String[] args) {
		Dog d1[] = { new labroder(), new pumerian() };

		for (Dog g : d1)
			// g.bark();
			g.eat();

		Dog d = new Dog() {

			@Override
			public void eat() {
				System.out.println("ppppp");
			}

			@Override
			public void bark() {
				// TODO Auto-generated method stub
				System.out.println("btttttd");

			}
		};
		d.bark();
		d.eat();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				try {
					for (int i = 1; i <= 10; i++) {
						System.out.println(i);
						Thread.sleep(1000);

					}
				} catch (InterruptedException e) {

				}
			}
		};

		new Thread(r1).start();
	}

}
