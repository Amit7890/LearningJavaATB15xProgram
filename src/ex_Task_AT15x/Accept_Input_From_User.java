package ex_Task_AT15x;

import java.util.Scanner;

public class Accept_Input_From_User
{
    static void main(String[] args) {

        // Accept different type of input from User

        Scanner s = new Scanner(System.in);
        // String

        System.out.println("Enter your Name");

        String name = s.nextLine();
        //Integer

        // Enter your
        System.out.println("Enter your age");
        int age = s.nextInt();

        // double
        System.out.println("Enter the Marks Obtain");

        double marks = s.nextDouble();

        if (marks>=90 && marks<=100)
        {
            System.out.printf("Your Name is %s , Age is %d and Your score Grade is A", name,age);
        }
        else if (marks>=80 && marks<=89)
        {
            System.out.printf("Your Name is %s , Age is %d and Your score Grade is B", name,age);
        }
        else if (marks>=70 && marks<=79)
        {
            System.out.printf("Your Name is %s , Age is %d and Your score Grade is C", name,age);
        }
        else if (marks>=60 && marks<=69)
        {
            System.out.printf("Your Name is %s , Age is %d and Your score Grade is D", name,age);
        }
        else if (marks>=0 && marks<=59)
        {
            System.out.printf("Your Name is %s , Age is %d and Your score Grade is F", name,age);
        }
    }
}
