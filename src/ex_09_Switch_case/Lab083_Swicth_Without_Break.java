package ex_09_Switch_case;

import java.util.Scanner;

public class Lab083_Swicth_Without_Break
{
    static void main(String[] args) {
        System.out.println("Enter a number from 1 to 7");
        Scanner s = new Scanner(System.in);
        int day = s.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid day input");

        }
    }
}
