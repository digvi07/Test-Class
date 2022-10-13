package com.test.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = " Hi Sangam, Digvijay here";
		String str2 = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			str2 = str2 + str.charAt(i);

		}

		System.out.println(str2);
	}

}
