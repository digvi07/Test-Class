package com.test.string;

public class CharCount {

	public static void main(String[] args) {

		String str = "Digvijay chavan @ gmail.com";
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}			


}
