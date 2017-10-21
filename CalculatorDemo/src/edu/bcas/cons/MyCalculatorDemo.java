package edu.bcas.cons;

public class MyCalculatorDemo {
	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator();
		int sum = cal.addNums(10, 20);
		int sub = cal.subNums(20, 60);
		int mul = cal.mulNums(20, 7);

		System.out.println("Sum of values " + sum);
		System.out.println("Sub of values " + sub);
		System.out.println("Mul of values " + mul);
	}
}
