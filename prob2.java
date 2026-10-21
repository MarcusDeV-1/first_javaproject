// Work By Marcus De Vera
import java.util.Scanner;

public class prob2{
	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("================================");
	System.out.println("        ONLINE SHOPPING         ");
	System.out.println("================================");
	
	System.out.println("Enter purchase amount: ");
	double amount = input.nextInt();
	
	if (amount >= 1500) {
		//System.out.println("Enter purchase amount: ₱" + amount);
		System.out.println("Free delivery applied. ");
	} else {
		//System.out.println("Enter purchase amount: ₱ + amount");
		System.out.println("No free delivery. ");
	}
  }
}