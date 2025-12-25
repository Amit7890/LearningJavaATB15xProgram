package ex_05_Ternary_Operator;

public class Lab068_Max_Of_Two_Number
{
    static void main(String[] args) {
        int a = Integer.parseInt(args[0]);  // accepting input from user using CLI command line argument
        int b = Integer.parseInt(args[1]);

        int max = (a>b)?a:b;

        System.out.println(max);
    }
}
