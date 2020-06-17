package com.in28mins.primitivedatatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				|| (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
			return true;
		}

		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) {
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 122) {
			return true;
		}

		return false;
	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 97; ch <= 122; ch++) {
			System.out.print(ch);
		}

	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 65; ch <= 90; ch++) {
			System.out.print(ch);
		}

	}

	public boolean isConsonant() {
		if (!isVowel() && isAlphabet()) {
			return true;
		}

		return false;
	}

}
