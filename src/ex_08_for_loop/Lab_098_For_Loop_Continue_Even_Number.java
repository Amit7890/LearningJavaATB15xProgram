package ex_08_for_loop;

import java.util.Scanner;

public class Lab_098_For_Loop_Continue_Even_Number
{
    static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        for (int i = 0 ; i<num;i++)
        {
            if(i%2!=0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
