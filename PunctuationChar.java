package com.test.string;

public class PunctuationChar {
	public static void main(String[] args) {
		String str = " Hi,sdgv\\.,iusdg;sdbvbh:'chavan'";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '/' || str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '?'
					|| str.charAt(i) == '"' || str.charAt(i) == ':' || str.charAt(i) == ';' || str.charAt(i) == '\"'
					|| str.charAt(i) == '\'') {
				count++;
			}
		}
		System.out.println("Total no of Punctuation Character = " + count);
	}
}