package com.ait.ex4;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

	/**
	 * @param args
	 */
	public static String reverse(String s) {
		List<String> tempArray = new ArrayList<String>(s.length());

		for (int i = 0; i < s.length(); i++) {
			tempArray.add(s.substring(i, i + 1));
		}
		
		StringBuilder reversedString = new StringBuilder(s.length());

		//for (int i = tempArray.size() - 1; i >= 0; i--) {
		for (int i = tempArray.size() - 1; i > 0; i--) {
			reversedString.append(tempArray.get(i));
		}
		System.out.println("reverse: " + reversedString.toString());
		return reversedString.toString();
	}

}
