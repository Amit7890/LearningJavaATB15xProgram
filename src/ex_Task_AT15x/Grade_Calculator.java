package ex_Task_AT15x;

import java.util.Scanner;

public class Grade_Calculator
{
    static void main(String[] args) {
        System.out.println("Enter the mark obtain");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        if (mark>=90 && mark<=100)
        {
            System.out.println("Grade is A");
        }
        else if (mark>=80 && mark<=89)
        {
            System.out.println("Grade is B");
        }
        else if (mark>=70 && mark<=79)
        {
            System.out.println("Grade is C");
        }
        else if (mark>=70 && mark<=79)
        {
            System.out.println("Grade is D");
        }
        else if (mark>=0 && mark<=59)
        {
            System.out.println("Grade is F");
        }
    }
}
