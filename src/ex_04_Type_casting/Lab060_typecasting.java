package ex_04_Type_casting;

public class Lab060_typecasting
{
    static void main(String[] args) {
        long phone = 9876543210L;
        //short a = phone;  // implicit narrowing
        short a = (short)phone;  // explicit narrowing  -- it losses value
        System.out.println(a);

        float a2 = 4.14f;
        int b = (int)a2;

        double d = 4.23;
        int d1 = (int)d;
        System.out.println(b);
        System.out.println(d1);
    }
}
