package ex_07_Jav_Basics;

import java.util.Scanner;

public class Lab081_Triangle_if_Else
{
    static void main(String[] args)
    {
        System.out.println("Enter three side of a triangle");

        // Taking input from user


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a == b && a==c)
        {
            System.out.println("Triangle is Acute");
        } else if (a == b || b==c || a == c)
        {
            System.out.println("Triangle is Isosceles");
        }
        else
        {
            System.out.println("Triangle is Scalene");
        }
    }
}
