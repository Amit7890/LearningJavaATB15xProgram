package ex_07_Jav_Basics;

import java.util.Scanner;

public class Sum_Of_two_Number
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a+b;

        System.out.println(sum);
    }
}
