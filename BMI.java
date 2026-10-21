// Made by INF263 De Vera, Marcus 
// Did not use AI tools
import java.util.Scanner;
  
  public class BMI {
	  public static void main(String [] Args) {
		Scanner sc = new Scanner(System.in);
	     
		System.out.println("Enter weight in pounds: ");
		double weight = sc.nextDouble();
		
		System.out.println("Enter height in inches: ");
		double height = sc.nextDouble();
		
		
		double weightKG = weight * 0.45359237;
		double heightM = height * 0.0254;
	    double bmi = weightKG/(heightM * heightM);
		
		System.out.println("Your BMI is: " + bmi);
	  
	    if (bmi < 16){
			System.out.println("You are seriously underweight");
		}else if (bmi < 18) {
			System.out.println("You are underweight");
		}else if (bmi < 24) {
			System.out.println("You are normal weight");
		}else if (bmi < 29) {
			System.out.println("You are overweight");
		}else if (bmi < 35) {
			System.out.println("You are seriously overweight");
		}else {
			System.out.println("You are gravely overweight"); }
 }
}