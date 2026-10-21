//This is my 20 day journey of practicing java and logical thinking using pseudocode.

//DAY 1 Output and your first program

//Warmup
/*public class java20dayPrac {
	public static void main (String[]args){
		System.out.println("Marcus Chaelel A. De Vera");
		System.out.println("BSIT-MWA");
		System.out.println("NU-Dasmarinas");
	}
} */

//Print stars challenge using System.out.println()
/*public class java20dayPrac {
	public static void main(String[]args){
	System.out.println("*");
	System.out.println("**");
	System.out.println("***");
	System.out.println("****");
	}
} */

/*change the program so Hello, and world! print on one line, using System.out.print twice. Expected:
Hello, world! */
/*public class java20dayPrac {
	public static void main (String[]args){
		System.out.print("Hello, ");
		System.out.print("world! ");
	}
} */

//Predict  Predict or fix (2 min)

//Given Code
/*public class Hello {
 public static void main(String[] args) {
 System.out.println("Hello")
 }
} */
//Answer: Wrong file name, no semicolon after the print.

// Stretch: Print a rectangle of stars, 5 wide and 3 tall
/*public class java20dayPrac {
	public static void main (String[]args){
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
	}
} */


//DAY 2

//Warmup
/*public class java20dayPrac {
	public static void main (String[]args){
		int age = 19;
		double coke = 1.5;
		boolean male = true;
		char firstLetter = 'M';
		String name = "Marcus";
		
		System.out.println("My name is " + name + "and I am " + age + "My favorite soda is coke " + coke + "And if am i a male? answer is " + male + "and the first letter of my name is" + firstLetter);
	}
} */

//Java Challenge
/*public class java20dayPrac {
	public static void main (String[]args){
		
		final double rate = 56.0;
		
		int dollars = 100;
		
		double result = dollars * rate;
		
		System.out.println(dollars + " = " + result);
		
	}
} */

//Predict or fix 
	/* int age = 20.5; // Needs to be double because of decimal point
	String name = 'Ana'; // Has to be double quotes ""
	boolean isDone = "false"; // Remove the double quotes */
	
	//fixed version
	/*double age = 20.5;
	String name = "Ana";
	boolean isDone = false; */
	
//Stretch: Swap two variables. Start with int a = 5, b = 9; and end with a = 9 and b = 5. You need a third variable. Print
//both values before and after.
/* public class java20dayPrac { 
	public static void main (String[]args){
		int a = 5;
		int b = 9;
		
		System.out.println("Before: a = " + a  + ", b= " + b);
		
		int after = a;
		a=b;
		b=after;
		
		System.out.println("After: a = " + a  + ", b= " + b);
		
	}
} */

//DAY 3 OPERATORS

// WARMUP
/*Split a bill. With int total = 47; and int people = 5;,
print what each person pays in whole pesos and how
many pesos are left over. Use / and %. */

/*import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);

    int total = 47;

    System.out.println("How many people will split?");
    int people = input.nextInt();

    double result = total / people;
    double change = total % people;

    System.out.println("Each pays: " + result + "PHP");
    System.out.println("Remaining: " + change + "PHP");
  }
} */

// Challenge 
/*With int n = 7;, store n % 2 == 0 in a boolean 
and print it. Then print whether n is greater than 
5 AND less than 10.  */

/*public class Main {
  public static void main(String[]args){
    int n = 7;

    System.out.println("The number is: " + n);

    boolean isEven = (n % 2 == 0);
    System.out.println("Is even: " + isEven);

    boolean between = (n > 5 || n < 10);
    System.out.println("In range: " + between);
    

  }

} */

//Predict or fix

/*public class Main{
  public static void main (String[]args) {

    int x = 10;
    x += 5;
    x *= 2;
    x--;
    
    System.out.println(x); // 10 + 5 x 2 -1 = 29 is the answer
    System.out.println(7 / 2); // 7 divide by 2 is 3
    System.out.println(7 % 2); // the remainder is 1
    System.out.println(7 / 2.0); // it has decimal point so will print 3.5
	
	
  }
} */

// Stretch
// Convert 3725 seconds into hours, minutes, and seconds.
/* public class Main {
    public static void main(String[] args) {
        int seconds = 3725;
        
        int hour = 3600;
        int mins = 60;
        
        int hourResult = seconds / hour;
        
        int remainder = seconds % hour; 
        
        int secResult = remainder / mins; 
        
        int result = remainder % 60; 
        
        // Print matching the expected format: 1h 2m 5s
        System.out.println(hourResult + "h " + secResult + "m " + result + "s");
    }
}*/

//DAY 4: if/else if/else

//Warmup: Letter grade. With int score = 88; print A for 90 and above, B for 80 to 89, C for 70 to 79, D for 60 to 69, and F
//below 60. Test with 95, 80, and 59.

/* public class Main {
    public static void main(String[] args) {
      int score = 59;

      System.out.println("Your score is: " + score);
    
      if (score > 90){
        System.out.println("Your grade is: A");
      }else if (score > 80){
        System.out.println("Your grade is: B");
      }else if (score > 70){
        System.out.println("Your grade is: C");
      }else if (score > 60){
        System.out.println("Your grade is: D");
      } else {
        System.out.println("Your grade is: F");
      }



    }
} */

//Java Challenge: Leap year check. A year is a leap year if it is divisible by 4, except years divisible by 100 that are not divisible by 400.
//Test 2024 (leap), 1900 (not), 2000 (leap).

/* public class Main {
    public static void main(String[] args) {
    int year = 1900;

    if (year % 4 == 0 && year %100 != 0 || year % 400 == 0){
      System.out.println(year + " " + "is a leap year.");
    }else {
      System.out.println(year + " " + "is not a leap year.");
    }
    }
} */

// Predict or fix: Snippet 1 does not compile. Snippet 2 compiles but prints the wrong letter. Explain both.
/* int score = 80;
 if (score = 80) { // It should have double == in order for it to result in "equals to"
 System.out.println("Perfect");
} */

/* int score = 95; // It prints wrong because java reads from top to bottom so the first condition is met so thats why its the one that prints.
if (score >= 60) {
 System.out.println("D");
} else if (score >= 90) {
 System.out.println("A");
}
  */
  
//Stretch: Find the largest of three numbers using only if statements. With a = 4, b = 9, c = 6, print 9.
/*  public class Main {
    public static void main(String[] args) {
    int a = 4;
    int b = 9;
    int c = 6;

    int largest = a;
    
    if (b > largest){
      largest = b;
    }else if (c > largest) {
      largest = c;
    } 
    System.out.println(largest);
    }
    
} */


//DAY 5: switch and 1 week review 

//WARMUP
/* With int dayNumber = 3; use switch to print the day name (1 is Monday). Add a default that prints Invalid day.
Test with 7 and 9. */
//EXPECTED OUTPUT: Wednesday

/* public class Main {
    public static void main(String[] args) {
      int dayNumber = 5;

      switch (dayNumber){
        case (1):
          System.out.println("Monday");
          break;
        case (2):
          System.out.println("Tuesday");
          break;
        case (3):
          System.out.println("Wednesday");
          break;
        case (4):
          System.out.println("Thursday");
          break;
        case (5):
          System.out.println("Friday");
          break;
        case (6):
          System.out.println("Saturday");
          break;
        case (7):
          System.out.println("Sunday");
          break;
        default:
          System.out.println("Invalid Day, Enter a valid day from 1-7");
      }
    
    }
} */

//Challenge: Mini calculator. With int a = 12, b = 4; char op = '/'; use switch on op for + - * /. Any other operator prints
//Unknown operator.

/* Mini calculator. With int a = 12, b = 4; char op = '/'; use switch on op for + - * /. Any other operator prints
Unknown operator. */
// EXPECTED OUTPUT: 12 / 4 = 3

/* public class Main{
  public static void main(String[]args){
    int num1 = 12;
    int num2 = 4;

    char op = '+';

    switch (op){
      case '+':
        int add = num1 + num2;
        System.out.println(num1 + " " + "+" + " " + num2  + " "  + "=" + " " + add);
        break;
       

      case '-':
        int sub = num1 - num2;
        System.out.println(num1 + " " + "-" + " " + num2  + " "  + "=" + " " + sub);
        break;
       

      case '*':
        int mul = num1 * num2;
        System.out.println(num1 + " " + "x" + " " + num2  + " "  + "=" + " " + mul);
        break;
       

      case '/':
        int div = num1 / num2;
        System.out.println(num1 + " " + "/" + " " + num2  + " "  + "=" + " " + div);
        break;
      

      default: 
        System.out.println("Invalid operator, choose from (+, -, *, /)");
    }

  }
} */

//Predict or fix 
// Predict the output. Then add break; after each print and predict again
/* public class Main{
  public static void main(String[]args){
    int n = 2;
      switch (n) {
        case 1: System.out.println("One");
        //break;
        case 2: System.out.println("Two"); // if break not added it will print this
        //break;
        case 3: System.out.println("Three"); // this
        //break;
        default: System.out.println("Other");// and this
    }
  }     // but with break, it will print case 2 ("Two")
} */

// Stretch
/* FizzBuzz for one number. With int n = 15; print Fizz if divisible by 3, Buzz if divisible by 5, FizzBuzz if both,
otherwise the number itself. Test 9, 10, 15, and 7. */

/* public class Main{
  public static void main(String[]args){
    int num = 7;

    if (num % 3 == 0 && num % 5 == 0){
      System.out.println("FizzBuzz");
    }else if (num % 3 == 0){
      System.out.println("Fizz");
    }else if (num % 5 == 0) {
      System.out.println("Buzz");
    }else {
      System.out.println(num);
    }
  }      
} */

// Day 6: For loops
//Warmup
/* public class Main {
    public static void main(String[] args) {
    
    for (int startNum = 1; startNum <=10; startNum++){
    System.out.println(startNum);
    }
  }
} */

// Java Challenge
/* public class Main {
    public static void main(String[] args) {
    int sum = 0;

    for (int startNum = 1; startNum <=100; startNum++){
    sum += startNum;
    }
    System.out.println("Sum: " + sum);
  }
} */

//Predict or fix
/* for (int i = 0; i < 5; i++) {
 System.out.print(i + " "); // output is ( 0, 1 , 2, 3, 4)
}
System.out.println();
for (int i = 10; i > 0; i -= 3) {
 System.out.print(i + " "); // output is ( 10, 7, 4, 1, )
} */

// Stretch
/* public class Main {
    public static void main(String[] args) {
    char star = '*';
    for (int row = 1; row <= 5; row++) {
      for (int col = 1 ; col <= row; col++){
        System.out.print(star);
      }
      System.out.println();
    }
  }
} */

// DAY 7 while loops

// Java warm-up: You have 1000 pesos and add 500 every month. Write pseudocode that counts how many months it takes to reach at
//least 3000.
/* public class Main {
    public static void main(String[] args) {
      int money = 1000;
      int months = 0;

      while (money < 3000){
        money += 500;
        months++;
      }
      System.out.println("Months needed: " + months);
    }
} */

// Java Challenge: Count the digits in int num = 48213; by dividing by 10 in a loop until the number reaches 0.
/* public class Main {
    public static void main(String[] args) {
      int num = 48123;
      int count = 0;

      while (num != 0){
        num /= 10;
        count++;
      }
      System.out.println("Digits:  " + count);
    }
} */

// Predict or fix: Snippet 1 never stops. Say why and fix it. Predict what Snippet 2 prints
//FIX
/*	int count = 0;
	while (count < 3) {
		System.out.println("Hi"); 
		// It never stops because it doesnt have the count++
	} */
//Predict
/*	int n = 3;
		while (n > 0) {
		System.out.print(n + " ");
		n--;
		}
		System.out.println("Liftoff"); // It will print "3,2,1, Liftoff" */
		
// Stretch: Reverse the digits of 1234 to get 4321. Use % 10 to grab the last digit and / 10 to drop it.
/* public class Main {
    public static void main(String[] args) {
      int num = 1234;
      int reversed = 0;

      while (num > 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
      }
      System.out.println(reversed);

    }
} */

//DAY 9: Arrays
// Write pseudocode that finds the largest number in a list of 5 numbers.
/*
Start 
list 5 numbers 
use a tool to find the largest number
print largest number 
End
*/
// 

// Java Warmup: With int[] scores = {90, 85, 77, 92, 68}; 
//score with its index using a for loop, then print the array length.
/* import java.util.*;
public class Main {
    public static void main(String[] args) {
      
      int [] scores = {90, 85, 77, 92};
      for(int i = 0; i < scores.length; i++){
        System.out.println("score" + " " + (i + 1) + ":" + scores[i]);
         
      }
  
    }
} */

// Java Challenge: Print the highest score, the lowest score, and the average. Use a loop.
/* public class Main {
    public static void main(String[] args) {
      int [] scores = {90, 85, 77, 92,68};

      int highest = scores[0];
      int lowest = scores[0];
      int sum = 0;
      
      for (int i = 0; i < scores.length; i++){
        if (scores[i] > highest) {
          highest = scores[i];
        }

        if (scores[i] < lowest) {
          lowest = scores[i];
        }
        sum += scores[i];
      }
      double average = (double) sum / scores.length;

      System.out.println("Highest: "+ highest);
      System.out.println("Lowest: "+ lowest);
      System.out.println("Average: "+ average); 
  }
} */

// Predict or fix
/* public class Main {
    public static void main(String[] args) {
      int[] a = {4, 8, 15, 16};
      System.out.println(a[4]); // indexes start with zero and 4 exceeds the limit.
    }
} */

// Stretch: Print the scores in reverse order, then count how many scores are 75 or higher.
/* public class Main {
    public static void main(String[] args) {
    int [] arrayz = {90, 85, 77, 92, 68};
    for (int i = arrayz.length - 1; i >= 0; i--) {
    System.out.println(arrayz[i]);
    }

    int passed = 0;
    for (int i = 0; i < arrayz.length; i++) {
    if (arrayz[i] >= 75) {
        passed++;
    }
    }
    System.out.println("Passed: " + passed);
    
    }
} */
