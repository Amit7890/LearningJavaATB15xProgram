package ex_08_for_loop;

public class Lab_101_For_Loop_pattern3
{
    static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }





    }
}
