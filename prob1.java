// Work By Marcus De Vera
import java.util.Scanner;

public class prob1 {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter minutes late: ");
	int minutes = input.nextInt();
	
	if (minutes > 15){
	System.out.println("You are late. ");	
	}	
  }
}