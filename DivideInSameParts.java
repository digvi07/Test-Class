package com.test.string;

//Java Program to divide a string in 'N' equal parts.
public class DivideInSameParts {
//	public static void main(String[] args) {
//
//	String str = "Digvijay";
//	
//	int len = str.length();
//	
//	int len1 = 0;
//	 len1 = len/3;
//	
//	String s1 = "";
//	String s2 = "";
//	for(int i =0 ; i<len1 ; i++) {
//		s1 = s1 + str.charAt(i);
//	
//	}for(int i=len1 ; i<len ; i++ ) {
//		s2 = s2 + str.charAt(i);
//
//	}
//	
//	System.out.println(s1);
//	System.out.println(s2);
//		
//	}

	// Divide in same "n" Number

	public static void main(String[] args) {

		String str = "Digvijay ";

		// Stores the length of the string
		int len = str.length();
		// n determines the variable that divide the string in 'n' equal parts
		int n = 3;
		int temp = 0, chars = len / n;
		// Stores the array of string
		String[] equalStr = new String[n];
		// Check whether a string can be divided into n equal parts
		if (len % n != 0) {
			System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				// Dividing string in n equal part using substring()
				String part = str.substring(i, i + chars); 
				
				equalStr[temp] = part;
				temp++;
				
			}
			System.out.println(n + " equal parts of given string are ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
	}

}
