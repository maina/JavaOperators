package com.honeacademy.helloworld;
/**
 * 
 * @author james
 * Class to demonstrate assignment operator usage
 */
public class HelloAssignmentOperator {
	
	//basic assignment operator. Assign value to a variable
	int time =2;
	int speed=60;
	int defaultValue=0;
	
	/**
	 * Assignment operator to assign value to a variable
	 */
	private void simpleAssignment() {
		int i=10;
		int j=20;
		System.out.println(String.format("Variable i value is %d", i));
		System.out.println(String.format("Variable j value is %d", j));

		
	}
	/**
	 * Compound assignments take the form variable operator=experssion;
	 * It's mostly a combination of arithmetic operator and an assignment operator 
	 */
	private void compoundAssignment() {
		//add 60 to speed value. Short form for speed=speed+60;
		speed +=60;
		System.out.println(String.format("speed value is %d", speed));
		//multiply time by 10. short form for time =time*10;
		time *=10;
		System.out.println(String.format("time value is %d", time));
		 int a=10;
		 a %=2;
		System.out.println(String.format("a modulus 2 %d", a));

	


	}

	public static void main(String[] args) {
		HelloAssignmentOperator assignmentOperator= new HelloAssignmentOperator();
		assignmentOperator.simpleAssignment();
		assignmentOperator.compoundAssignment();

	}

}
