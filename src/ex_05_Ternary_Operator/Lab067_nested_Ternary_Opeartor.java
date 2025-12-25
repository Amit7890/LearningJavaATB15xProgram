package ex_05_Ternary_Operator;

public class Lab067_nested_Ternary_Opeartor
{
    static void main(String[] args) {
        int age = 25;
        String name = "Devansh";
        String result = (age>18)?((age>20)?"He can go to watch Dhurander Movie":"He can't go to watch Dhurender Movie"):"Devansh is Minor";

        System.out.println(result);

    }
}
