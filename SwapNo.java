package com.test.string;
                // By using Third variable & without using third variable  
public class SwapNo {
	public static void main(String[] args) {

		int a = 12;
		int b = 24;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("After swap");
//		int c;
//		c = a;
//		a = b;
//		b = c;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
