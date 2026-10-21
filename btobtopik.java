//Made by Marcus De Vera
//Did not use AI tools

import java.util.Scanner;
import java.util.Random;
	
public class btobtopik {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int pcChoice = rand.nextInt(3);
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userChoice = sc.nextInt();
		
		if (pcChoice == 0) {
			System.out.print("The computer is scissor. ");
		} else if (pcChoice == 1) {
			System.out.print("The computer is rock. ");
		} else {
			System.out.print("The computer is paper. ");
		}
		
		if (pcChoice == userChoice) {
			System.out.println("It is a draw");
		} else if (userChoice == 0 && pcChoice == 2) {
			System.out.println("You won");
		} else if (userChoice == 1 && pcChoice == 0) {
			System.out.println("You won");
		} else if (userChoice == 2 && pcChoice == 1) {
			System.out.println("You won");
		} else {
			System.out.println("You lost");
		}
		
		
	 }	
	}		
