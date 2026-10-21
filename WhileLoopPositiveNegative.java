//Author: Ryan and Marcus
//INF263

import java.util.Scanner;

public class WhileLoopPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int positives = 0;
        int negatives= 0;
        int sum = 0;
        int numbers = 0;

        while (true) {
            System.out.print("Enter an int value, the program exits if the input is 0: ");
            
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            }

            sum += number;
            numbers++;
        }

        if (numbers > 0) {
            double average = (double) sum / numbers;
            System.out.println("The number of positives is " + positives);
            System.out.println("The number of negatives is " + negatives);
            System.out.println("The sum is " + sum);
            System.out.println("The average is " + average);
        } else {
            System.out.println("Invalid.");
        }

  
    }
}
