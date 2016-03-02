import java.util.Scanner;

/**
 * Created by kevin_000 on 1/28/2016.
 */
public class SumOfNumbers
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter an integer besides 0");
        int number = keyboard.nextInt();
        int num = 0;
        for (int x = 0; x <= number; x++)
        {
            num += x;

        }
        System.out.println(num +" is the sum of the numbers");
    }
}
