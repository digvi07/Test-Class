package com.test.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		Palindrome.Test(str);
	}

	public static void Test(String str) {

		int len = str.length();

		String str2 = "";

		for (int i = len - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		if (str.equals(str2)) {
			System.out.println("This is Palindrome String");
		} else {
			System.out.println("This is Not Palindrome String");
		}
	}
}
