package ex_Java_Test_11_Dec_2026;

import java.util.Scanner;

public class Even_Odd_Number
{
    static void main(String[] args) {
        System.out.println("Enter two positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 == 0)
        {
            System.out.printf("%d is Even Number",a);
        }
        else
        {
            System.out.printf("%d is Odd Number",a);
        }
    }
}
