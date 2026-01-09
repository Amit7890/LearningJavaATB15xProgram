package ex_08_for_loop;

public class Lab_100_For_loop_Pattern2
{
    static void main(String[] args) {
        for (int i = 1;i<=5;i++)
        {
            for (int j = 5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
