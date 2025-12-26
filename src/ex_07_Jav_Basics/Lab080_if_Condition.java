package ex_07_Jav_Basics;

import java.util.Scanner;

public class Lab080_if_Condition
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age!");
        int age = scanner.nextInt();
        if (age > 18)
        {
            System.out.println("Hi");
        }
        else
        {
            System.out.println("Hello");
        }
    }
}
