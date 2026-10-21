// Work By Marcus De Vera
import java.util.Scanner;

public class prob3 {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("================================");
	System.out.println("         LIBRARY SYSTEM         ");
	System.out.println("================================");
	
	System.out.println("Enter number of days overdue: ");
	int days = input.nextInt(); 
	
	if (days > 7){
		System.out.println("Fine will be charged. ");
	} else {
		System.out.println("No fine will be charged. ");
	}	
  }
}