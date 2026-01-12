package ex_Java_Test_11_Dec_2026;

import java.util.Scanner;

public class Max_of_Two_Number
{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number:");
        int a= sc.nextInt();
        System.out.print("Enter Second Number:");
        int b = sc.nextInt();
        int max = a>b?a:b;
        System.out.printf("Max of two Number is: %d",max);
    }
}
