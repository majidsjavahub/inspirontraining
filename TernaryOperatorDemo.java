package com.inspiron;

public class TernaryOperatorDemo {
	public static void main(String[] args) {

		int i = 100;
		// ? - ternary operator
		System.out.println((i == 100) ? "is is equal to 100" : "i is not equal to 100");

		// this is with if-else-if

		if (i == 100) {
			System.out.println("i is equal to 100");
		} else {
			System.out.println("i is not equal to 100");
		}
	}
}