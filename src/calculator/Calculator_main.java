package calculator;

import java.util.Scanner;

public class Calculator_main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the operator\n"+
				" + : 1\n"+
				" - : 2\n"+
				" * : 3\n"+
				" / : 4\n");

		int operator = keyboard.nextInt();

		System.out.println("Enter a first integer");
		int num1 = keyboard.nextInt();
		System.out.println("Enter a second integer");
		int num2 = keyboard.nextInt();

		int result = 0;
		switch (operator) {
		case 1:
			result = new Calculator().sum(num1, num2);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}

		System.out.println("The result is " + result + ".\n");
		keyboard.close();
	}
}
