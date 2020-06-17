package com.in28minutes.firstjava;

public class MultiplicationTable {
	void print () {
		print(5, 1, 10);
	}
	void print (int n) {
		print(n, 1, 10);
	}
	void print (int n, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
 