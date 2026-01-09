package ex_08_for_loop;

public class Lab_095_Odd_Even
{
    static void main(String[] args) {
        for (int i =0;i<10;i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i + " is Even Number");
            }
            else
            {
                System.out.println(i + " Is odd Number");
            }
        }
    }
}
