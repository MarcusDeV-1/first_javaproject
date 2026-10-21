// ODD or EVEN
/*
import java.util.Scanner;
public class Practice {
	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number to know if it's odd or even: ");
	int num = input.nextInt();
	
	if (num %2==0){
		System.out.println("The number" + " " + num + " " +"is even");
	} else
		System.out.println("The number" + " " + num + " " + "is odd");
	}
} */





//GRADE JUDGEMENT
/*import java.util.Scanner;
public class Practice {
	public static void main (String[]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter grade: ");
	double grade = input.nextInt();
	
	if (grade >= 90) {
		System.out.println("Your grade is A");
	} else if (grade >= 80){
		System.out.println("Your grade is B");
	} else if (grade >= 75) {
		System.out.println("Your grade is C");
	} else {
		System.out.println("You Failed! Better luck next time");
	}
	
	System.out.println("Your grade is: " + grade);
}
} */





//SWITCH CASE PRACTICE DAYS OF THE WEEK School Schedule
/*import java.util.Scanner;
public class Practice {
	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter days of the week to see your weekly School Schedule: ");
	String sched = input.nextLine().trim().toLowerCase();
	
	switch (sched) {
		case "monday":
			System.out.println("Classes are 7:00AM-3:00PM");
			System.out.println("7:00AM-9:00AM Purposive Communication");
			System.out.println("9:00AM-11:00AM Understanding the Self");
			System.out.println("11:00AM-1:00PM Break Time");
			System.out.println("1:00PM-3:00PM Readings in Philippine History");
			break;
		case "tuesday":
			System.out.println("Classes are 7:00AM-3:00PM");
			System.out.println("7:00AM-11:00AM Introduction to Computing");
			System.out.println("11:00AM-3:00PM Fundamentals of Programming");
			break;
		case "wednesday":
			System.out.println("No Classes");
			System.out.println("Go Self Study");
			break;
		case "thursday":
			System.out.println("Classes are 7:00AM-7:00PM");
			System.out.println("7:00AM-9:00AM Purposive Communication");
			System.out.println("9:00AM-11:00AM Understanding the Self");
			System.out.println("11:00AM-1:00PM Break Time");
			System.out.println("1:00PM-3:00PM Readings in Philippine History");
			System.out.println("3:00PM-5:00PM Break time, Spend time on other things");
			System.out.println("5:00PM-7:00PM Science, Technology, and Society");
			break;
		case "friday":
			System.out.println("Classes are 7:00AM-6:20PM");
			System.out.println("7:00AM-9:40AM Introduction to Computing");
			System.out.println("10:00AM-12:40PMFundamentals of Programming");
			break;
		case "saturday":
			System.out.println("No Classes");
			System.out.println("Go Self Study, Spend time with yourself, rest.");
			break;
		case "sunday":
			System.out.println("No Classes");
			System.out.println("Enjoy and rest, prepare for monday and repeat.");
			break;
		default:
                System.out.println("Invalid day. Please enter a day from Monday to Sunday.");
		
			
	
	
	}
	
	
	
	}
} */





//FOR LOOP PRACTICE: 

// Print the numbers 1 to 10, one per line.
/*import java.util.Scanner;
public class Practice {
	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	  for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
	}
} */


// Even numbers 2 to 20
/* import java.util.Scanner;
public class Practice {
    public static void main (String[]args){
	for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
	}
} */



// Add up the numbers from 1 to 100 and print the total. Expected: 5050.
/*import java.util.Scanner;
public class Practice {
    public static void main (String[]args){
	int sum = 0;
	for (int i = 1; i <= 100; i ++) {
            System.out.println(i);
        }
	}
} */



// MULTIPLICATION TABLE
/*import java.util.Scanner;
public class Practice {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter a number: ");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
		
	}
	
} */

//Triangle 
/*public class Practice {
	public static void main (String[]args){

    for (int rows = 1; rows <= 10; rows++) {
    for (int col = 1; col <= rows; col++) {
        System.out.print("*");
    }
	System.out.println(" "); 
}

	}
} */

// FOR LOOP MY PRACTICE 
/*
public class Practice {
	public static void main (String[]args){
		
		for (int i = 1;i <=8; i++){
			System.out.println("Hello World");
		}


	}
} */


//WHILE LOOP PRACTICE

//Print the numbers 1 to 10.
/*import java.util.Scanner;
public class Practice {
	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	
	int i = 1;
	while (i <= 10) {
		System.out.println(i);
		i++;
	}
	}
} */

// Java Addition WHILE LOOP
/*import java.util.Scanner;
	public class Practice {
		public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("Enter a number (0 to stop): ");
		int num = input.nextInt();
		
		while (num != 0){
			sum += num;
			System.out.pr+ntln("Enter a number (0 to stop): ");
			num = input.nextInt();
		}
		System.out.println("Total: " + sum);
		
		}
	} */
	
// Multiplication table
/* import java.util.Scanner;
public class Practice {
	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number to see its multiplication table: ");
	int num = input.nextInt();
	
	int count = 1;
	
	while(count <= 10){
		System.out.println(num + " x " + count + " = " + (num * count));
		count++;
	} 
	}
} */

// Countdown Practice
/*public class Practice {
	public static void main (String[]args){
	
	int countdown = 10;
	
	while (countdown >=1){
		System.out.println(countdown);
		countdown --;
	}
	System.out.println("Liftoff!");
}
} */


//While loop Practice: Guessing Game
/*import java.util.Scanner;
public class Practice{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	int secretNum = 7;
	
	System.out.println("Guess the secret number between 1-10. Enter your guess: ");
	int answer = input.nextInt();
	
	while (answer != secretNum){
		System.out.println("Wrong! try again");
		answer = input.nextInt();
	}
	System.out.println("You are correct! good guess");
	
	}
	
} */

//While loop Practice: Challenge: print only the even numbers between 1 and 20, using a while loop.

/*public class Practice{
	public static void main (String[]args){
	
	int start = 1;
	
	while (start <= 20){
		if (start %2== 0) {
			System.out.println(start);
		}
		start++;
	}
	}
} */


