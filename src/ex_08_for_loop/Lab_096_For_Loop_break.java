package ex_08_for_loop;

public class Lab_096_For_Loop_break
{
    static void main(String[] args) {
        for (int i = 0;i<10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("End");
    }
}
