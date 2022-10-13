package com.test.string;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String str1 = "Digvijay ";
		String str2 = "jayviDig";
		
		char[] s1 = str1.toLowerCase().toCharArray();
		char[] s2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		System.out.println(s1);
		System.out.println(s2);

		if(Arrays.equals(s1, s2)) {
			System.out.println("This String is Anagram");
		}else {
			System.out.println("This String is Not Anagram");
		}
	}
}
