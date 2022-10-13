package com.test.string;

public class CountVowels {

	public static void main(String[] args) {

		String str = "Hi Digvijay Chavan here";
		int count = 0 ;
		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count ++;
			}else if(str.charAt(i) !=' ') {
				count2++;
			}
		}
			System.out.println("Total no of vowels are = "+count);
			System.out.println("Total no of consonants  are = "+count2);

	}

}
