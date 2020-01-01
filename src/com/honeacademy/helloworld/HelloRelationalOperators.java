package com.honeacademy.helloworld;

/**
 * 
 * @author james Class to demonstrate relational operators use:  ==, !=, < , > ,=<, >=
 *         
 *
 */
public class HelloRelationalOperators {

	public static void main(String[] args) {
		int i = 10;
		int j = 30;

		System.out.println(String.format("is i equals to j? %s", i == j));
		System.out.println(String.format("is i not equal to j? %s", i != j));
		System.out.println(String.format("is i less than j? %s", i < j));
		System.out.println(String.format("is i greater than j? %s", i > j));
		System.out.println(String.format("is i less than or equal j? %s", i <= j));
		System.out.println(String.format("is i greater than or equal j? %s", i >= j));

	}

}
