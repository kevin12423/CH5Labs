/**
 * Created by kevin_000 on 2/1/2016.
 */
import java.util.Scanner;
public class TheGreatestAndLeast
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int saved;
        int higher = 0;
        int lower;

        System.out.println("Please enter as many number as you would like. ENTER -99 to exit");
        int num = input.nextInt();
        if(num != -99)
        {
            lower = num;

        }
        else
        {
            lower = 0;
        }
        while(num != -99)

        {
                saved = num;
                if (saved > higher) {
                    higher = saved;
                }
                if (saved < lower) {
                    lower = saved;
                }
                System.out.println("Please enter as many number as you would like. ENTER -99 to exit");
                num = input.nextInt();



        }


        System.out.println("The lowest number is " + lower);
        System.out.println("The higest number is " + higher);
    }
}
