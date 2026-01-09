package ex_09_Switch_case;

import java.util.Scanner;

public class Lab084_arrow_Without_break
{
    static void main() {
        System.out.println("Enter day of the week");
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt())
        {
            int day = s.nextInt();
            switch (day) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid Day");
            }

        }
        else
        {
            System.out.println("Invalid int input");
        }
    }
}
