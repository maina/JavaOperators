package com.honeacademy.helloworld;
/**
 * 
 * @author james
 * Class to demonstrate logical operators in Java
 *
 */
public class HelloLogicalOperators {
	/**
	 * Method to demonostrate use of & operator
	 * Both expressions must be true for AND to return true
	 */
	private void andOperator() {
		int i=10;
		System.out.println(String.format("AND operator %s", i<10 & i<20));
		System.out.println(String.format("AND operator %s", i<20 & i<20));
		System.out.println(String.format("AND operator %s", i<9 & i<20));
		System.out.println(String.format("AND operator %s \n", i<=9 & i<20));
	}
	/**
	 * Method to demonstrate || operator
	 * If one expression returns true the whole expression is true
	 */
	private void orOperator() {
		int i=10;
		System.out.println(String.format("OR operator %s", i>10 || i>20));
		System.out.println(String.format("OR operator %s", i>20 || i>20));
		System.out.println(String.format("OR operator %s", i>9 || i>20));
		System.out.println(String.format("OR operator %s \n", i>=9 || i<20));
	}
	/**
	 * Method to demonstrate not operator
	 * Note the output here. It's the opposite of the or output since not negates the output
	 */
	private void notOperator() {
		int i=10;
		System.out.println(String.format("NOT operator %s", !(i>10 || i>20)));
		System.out.println(String.format("NOT operator %s", !(i>20 || i>20)));
		System.out.println(String.format("NOT operator %s", !(i>9 || i<20)));
		System.out.println(String.format("NOT operator %s \n", !(i>=9 || i<20)));
	}

	public static void main(String[] args) {
		HelloLogicalOperators helloLogicalOperators = new HelloLogicalOperators();
		helloLogicalOperators.andOperator();
		helloLogicalOperators.orOperator();
		helloLogicalOperators.notOperator();
	}

}
