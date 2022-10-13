package com.test.string;

import java.util.*;
                        // Repeated Character Count using Collection 
public class RepeatedCharacterCount {

	public static void main(String[] args) {

		String str = " Digvijay ";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();

		TreeSet treeSet = new TreeSet();

		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			treeSet.add(ch[i]);
		}

		ArrayList al1 = new ArrayList(treeSet);

		ArrayList al2 = new ArrayList();

		for (int i = 0; i < ch.length; i++) {

			al2.add(ch[i]);

		}
		
		for(int i =0 ; i < al1.size(); i++ ) {
			int count=0 ;
			for(int j = 0 ; j< al2.size() ; j++ ) {
				
				if(al1.get(i) == al2.get(j)) {
					count ++;
				}
				
			}
			System.out.println("Letter "+ al1.get(i) +" occurance"+count);
		}

	}
}
