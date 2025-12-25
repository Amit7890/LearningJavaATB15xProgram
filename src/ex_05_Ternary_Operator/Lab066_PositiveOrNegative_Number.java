package ex_05_Ternary_Operator;

public class Lab066_PositiveOrNegative_Number
{
    static void main(String[] args) {
        int a = -5;
        int b= 7;
        String number = ( a > 0 ) ? "+ve" : "-ve";
        String number1 = ( b > 0 ) ? "+ve" : "-ve";
        System.out.printf("%d is %s Number%n",a,number);
        System.out.printf("%d is %s Number", b,number1);
    }
}
