//INF363_Fundamentals-of-Programming_Calculator

// Made by Marcus Chaelel A. De Vera
import java.util.Scanner;
	
	public class Calculator {
		public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====JAVA MINI CALCULATOR=====");
		System.out.println("1. Addition ");
		System.out.println("2. Subtraction ");
		System.out.println("3. Multiplication ");
		System.out.println("4. Division ");
		System.out.println("5. Power ");
		System.out.println("6. Square Root ");
		System.out.println("7. Absolute Value ");
		System.out.println("8. Maximum ");
		System.out.println("9. Minimum ");
		System.out.println("10. Exit ");
		
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		if (choice ==1) {
			System.out.println("The operation is addition ");
			
			System.out.println("Enter first number: ");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter second number: ");
			double num2 = sc.nextDouble();
			
			double result = num1 + num2;
			System.out.println("Result: " + result);
		}
		else if (choice ==2) {
			System.out.println("The operation is subtraction ");
			
			System.out.println("Enter first number: ");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter second number: ");
			double num2 = sc.nextDouble();
			
			double result = num1 - num2;
			System.out.println("Result: " + result);
		}
		else if (choice ==3) {
			System.out.println("The operation is multiplication ");
			
			System.out.println("Enter first number: ");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter second number: ");
			double num2 = sc.nextDouble();
			
			double result = num1 * num2;
			System.out.println("Result: " + result);
		}
		else if (choice == 4) {
			System.out.println("The operation is division ");
			
			System.out.println("Enter first number: ");
			double num1 = sc.nextDouble();
			
			
			System.out.println("Enter second number: ");
			double num2 = sc.nextDouble();
			
			if (num2 == 0) {
			System.out.println("Cannot divide by zero.");
			} else {
			double result = num1 / num2;
			
			System.out.println("Result: " + result);
        }
      }
		else if (choice ==5){
			System.out.println("The operation is power ");
			
			System.out.println("Enter base: ");
			double base = sc.nextDouble();
			
			System.out.println("Enter exponent: ");
			double exponent = sc.nextDouble();
			double result = Math.pow(base, exponent);
			
			System.out.println("Result: " + result);
}
		else if (choice ==6){
			System.out.println("The operation is square root ");
			
			System.out.println("Enter a number: ");
			double num = sc.nextDouble();
			
			if (num < 0) {
			System.out.println("Cannot find the square root of a negative number.");
			} else {
			double result = Math.sqrt(num);
			
			System.out.println("Square Root: " + result);
			}
		  }  
		else if (choice ==7){
			System.out.println("The operation is Absolute Value ");
			
			System.out.println("Enter a number: ");
			
			double num = sc.nextDouble();
			double result = Math.abs(num);
			
			System.out.println("Result: " + result);	
		}
		else if (choice ==8){
			System.out.println("The operation is Maximum ");
			
			System.out.println("Enter first number: ");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter second number: ");
			double num2 = sc.nextDouble();
			
			double result = Math.max(num1, num2);
			
			System.out.println("Maximum: " + result);	
		}
		else if (choice ==9){
			System.out.println("The operation is Minimum ");
			
			System.out.println("Enter first number: ");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter second number: ");
			double num2 = sc.nextDouble();
			
			double result = Math.min(num1, num2);
			
			System.out.println("Minimum: " + result);
 }
		else if (choice ==10){
			System.out.println("Exiting program. Goodbye!!!");
		} else {
			System.out.println("Invalid choice");
		}
 }	
}