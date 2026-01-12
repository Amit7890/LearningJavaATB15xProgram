package ex_Java_Test_11_Dec_2026;

import java.util.Scanner;

public class Arithmetic_Operation_Two_Number {
    static void main(String[] args) {
        System.out.println("Enter two Integer Number");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        System.out.printf("Sum of two Number is %f%n",(a+b));
        System.out.printf("Differnce of two number is %f%n",(a-b));
        System.out.printf("Multiplication of two number is %f%n", (a*b));
        System.out.printf("Division of two Number is %f%n",(a/b));
        System.out.printf("Remainder of two Number is %f%n",(a%b));

    }
}
