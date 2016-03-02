/**
 * Created by kevin_000 on 2/2/2016.
 */

import java.util.Scanner;

public class BarChartDriver
{
    public static void main(String[] args)
    {
        String star = "*";
        Scanner input = new Scanner(System.in);
        System.out.println("What were the sales for the first store?");
        int store1 = input.nextInt();
        System.out.println("What were the sales for the Second store?");
        int store2 = input.nextInt();
        System.out.println("What were the sales for the Third store?");
        int store3 = input.nextInt();
        System.out.println("What were the sales for the Fourth store?");
        int store4 = input.nextInt();
        System.out.println("What were the sales for the Fifth store?");
        int store5 = input.nextInt();
        System.out.println("Store 1");
        for (int x = 0; x < store1 / 100; x++)
        {
            System.out.print(star);
        }
        System.out.println("\nStore 2");
        for (int x = 0; x < store2 / 100; x++)
        {
            System.out.print(star);
        }
        System.out.println("\nStore 3");
        for (int x = 0; x < store3 / 100; x++)
        {
            System.out.print(star);
        }
        System.out.println("\nStore 4");
        for (int x = 0; x < store4 / 100; x++)
        {
            System.out.print(star);
        }
        System.out.println("\nStore 5");
        for (int x = 0; x < store5 / 100; x++)
        {
            System.out.print(star);
        }

    }
}
