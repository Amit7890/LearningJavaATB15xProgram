package ex_Task_AT15x;

import java.util.Scanner;

public class Palindrome_String
{
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string to compare Palindrome:");

        String name = s.next();

        String reverse = new StringBuilder(name).reverse().toString();

        if (reverse.equals(name))
        {
            System.out.printf("%s is Palindrome",name);
        }

        else
        {
            System.out.printf("%s is not Palindrome",name);
        }

    }
}
