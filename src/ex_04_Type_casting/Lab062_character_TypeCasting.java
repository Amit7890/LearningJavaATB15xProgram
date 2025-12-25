package ex_04_Type_casting;

public class Lab062_character_TypeCasting
{
    static void main(String[] args) {
        char ch = 'A';
        int a = ch;  // implicit widening

        System.out.println(a);

        int num = 97;
        char ch1 = (char)num;  // explicit narrowing

        System.out.println(ch1);
    }
}
