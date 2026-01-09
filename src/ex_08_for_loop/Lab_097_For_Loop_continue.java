package ex_08_for_loop;

public class Lab_097_For_Loop_continue
{
    static void main(String[] args) {
        for (int i = 0;i<10;i++)
        {
            if (i==5)
            {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End");
    }
}
