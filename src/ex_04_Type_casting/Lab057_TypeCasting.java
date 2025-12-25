package ex_04_Type_casting;

public class Lab057_TypeCasting
{
    static void main(String[] args)
    {
        byte b = 10;
        int a = b;  //Implicit -- casting Widening
        float f =b;
        //boolean b1 = b;
        int b1 = (int)b; // Valid syntax  -- explicit widening
    }
}
