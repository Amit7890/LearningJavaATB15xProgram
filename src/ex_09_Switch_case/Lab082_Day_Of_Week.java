package ex_09_Switch_case;

import java.util.Scanner;

public class Lab082_Day_Of_Week
{
    static void main(String[] args)
    {
        System.out.println("Enter day of the week");
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt())
        {
            int day = s.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Day");
            }

        }
        else
        {
            System.out.println("Invalid int input");
        }

    }
}
