package ex_05_Ternary_Operator;

public class Lab0064_Max_Of_Three_number
{
    static void main(String[] args) {
//        int a =Integer.parseInt(args[0]);
//        int b=Integer.parseInt(args[1]);
//        int c =Integer.parseInt(args[2]);
        int a = 5;
        int b = -4;
        int c= 40;
        int max = (a>b && a>c) ? a : (b>a && b>c) ? b : c;
        System.out.println(max);
    }
}
