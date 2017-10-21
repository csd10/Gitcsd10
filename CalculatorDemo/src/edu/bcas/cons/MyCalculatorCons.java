package edu.bcas.cons;

public class MyCalculatorCons {

	static int num1, num2;

	public MyCalculatorCons(int x, int y) {

		num1 = x;
		num2 = y;
	}

	public static int addNums() {
		int result = num1 + num2;
		return result;
	}

	public static int subNums() {
		int result = num2 - num1;
		return result;
	}

	public static int mulNums() {
		int result = num2 * num1;
		return result;
	}

	public static int divNums() {
		int result = num2 / num1;
		return result;
	}

	public void printSummary() {
		System.out.println("SUM IS " + addNums());
		System.out.println("SUB IS " + subNums());
		System.out.println("MUL IS " + mulNums());
		System.out.println("DIV IS "+ divNums());
	}
}
