package ex_05_Ternary_Operator;

public class Lab070_Age_Classification
{
    static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        String result = (age<18)?"Minor":((age<=60)?"Adult":"Senior Citizen");
        System.out.println(result);
    }
}
