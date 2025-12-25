package ex_04_Type_casting;

public class Lab061_typecasting_Used
{
    static void main(String[] args) {
        int course = 1000;
        float tax = 3.54f;
        int total = course + (int)tax;
        System.out.println(total);
        float total2 = (float)course + tax;
        System.out.println();
        System.out.println(total2);
    }
}
