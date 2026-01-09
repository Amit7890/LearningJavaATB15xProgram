package ex_Task_AT15x;

import java.util.Scanner;

public class Palindrome_Number
{
    static void main(String[] args) {
        System.out.println("Enter a Number to check Palindrome Number");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int reverse_num = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());

        if (reverse_num == number)
        {
            System.out.printf("%d is Palindrome Number",number);
        }
        else
        {
            System.out.printf("%d is Not Palindrome Number",number);
        }
        num.nextLine();
    }
}
