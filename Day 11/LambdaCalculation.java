package Day11;

import java.util.Scanner;

@FunctionalInterface
interface Finder {
	 double value(double a1, double b1);
}

public class LambdaCalculation {
	Scanner sc;
	Scanner sa;
	

	public static void main(String[] args) {
		double a;
		double b;
		Scanner sc = new Scanner(System.in);
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter a value: ");
		
		a = sc.nextInt();
		System.out.println("Enter b value: ");
	    b = sa.nextInt();

		// addition
		Finder f = (a1, b1) -> (a + b);
		System.out.println("Sum of two numbers is: " + f.value(a, b));

		// subtraction
		Finder f1 = (a1, b1) -> (a - b);
		System.out.println("Subtraction of two numbers is: " + f1.value(a, b));
		
		// Multiplication
		Finder f2 = (a1, b1) -> (a * b);
		System.out.println("Multiplication of two numbers is: " + f2.value(a, b));

		// Division
		Finder f3 = (a1, b1) -> (a / b);
		System.out.println("Division of two numbers is: " + f3.value(a, b));

		// Reminder
		Finder f4 = (a1, b1) -> (a % b);
		System.out.println("Reminder of two numbers is: " + f4.value(a, b));

		// Maximum number
		System.out.println("Maximum number of two numbers is: " + Math.max(a, b));
		
		// Minimum number
	    System.out.println("Minimum number of two numbers is: " + Math.min(a, b));
	    
		// addition
		Finder f5 = (a1, b1) -> (a*a + b*b);
		System.out.println("Square sum value of two numbers is: " + f5.value(a, b));
		}
	}


