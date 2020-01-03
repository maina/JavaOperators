package com.honeacademy.helloworld;
/**
 * 
 * @author james
 * Class to demonstrate use of ternary operator and the alternative if-else statements
 *
 */
public class HelloTernaryOperator {
	
	/**
	 * compare three numbers using ternary operator
	 * @param i
	 * @param j
	 * @param k
	 */
	private void compareNumbers(int i, int j, int k) {
		int maxNumber=((i > j) ? (i > k)? i: k: (j > k)? j: k); 
		System.out.println(String.format("Max number using ternary operator is %d", maxNumber));

	}
	/**
	 * compare three numbers using if-else
	 * ternary operator is a good short form for the if-else but less readable
	 * @param i
	 * @param j
	 * @param k
	 */
	private void compareNumbersUsingIfElse(int i, int j, int k) {
		int maxNumber =k;
		if(i>j) {
			maxNumber=i;
		}else if(i>k) {
			maxNumber = i;
		}else if(j>k) {
			maxNumber=j;
		}
		System.out.println(String.format("Max number using if-else is %d", maxNumber));
				
	}
	/**
	 * compare two numbers using ternary operator
	 * @param i
	 * @param j
	 */
	private void compareNumbers(int i, int j) {
        String message = i>j? i+" is greater than "+j: i==j?i+" is equal to "+j:j+" is greater than "+i;
        System.out.println(message); 


		
	}

	public static void main(String[] args) {
		HelloTernaryOperator ternaryOperator= new HelloTernaryOperator();
		ternaryOperator.compareNumbers(10, 20);
		ternaryOperator.compareNumbers(10, 10);
		ternaryOperator.compareNumbersUsingIfElse(12, 8,9);
		ternaryOperator.compareNumbers(12, 8,9);

	}

}
