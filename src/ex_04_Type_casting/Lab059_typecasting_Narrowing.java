package ex_04_Type_casting;

public class Lab059_typecasting_Narrowing
{
    static void main(String[] args) {
        int val = 300;
        // byte b = val; //Implicit Narrowing
        byte b2 = (byte)val;  // explicit narrowing
        System.out.println(b2);
    }

}
