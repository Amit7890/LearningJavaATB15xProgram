package ex_Java_Test_11_Dec_2026;

import java.util.Scanner;

public class Positive_negative_Zero
{
    static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String s = a!=0?(a>0?"+ve":"-Ve"):"Zero";
        System.out.printf("Number is %s",s);
    }
}
