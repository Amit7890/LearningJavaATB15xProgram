package ex_10_While_Lopp;

import java.util.Random;
import java.util.Scanner;

public class Lab_107_While_Guessing_Number
{
    static void main(String[] args) {
        Random random = new Random();
        int number_to_Guess = random.nextInt(100);
        System.out.println("Number to Guess "+number_to_Guess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int guess;
        int attempt =0;

        while (true)
        {
            if (!scanner.hasNext())
            {
                System.out.println("Invalid Input! Please enter a valid Integer Only");
                scanner.next();
                continue;
            }
            guess=scanner.nextInt();
            attempt++;
            if (guess<number_to_Guess)
            {
                System.out.println("To Low!, Try again with higher number");
            } else if (guess>number_to_Guess)
            {
                System.out.println("To High! Try again with lower number");
            }
            else
            {
                System.out.println("correct! You have taken Number of attempt "+attempt);
                break;
            }
        }
    }
}
