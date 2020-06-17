package com.in28mins.primitivedatatypes;

public class CharPuzzleRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonant());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		// static methods to print all alphabets
		MyChar.printLowerCaseAlphabets();
		System.out.println();
		MyChar.printUpperCaseAlphabets();
	}

}
