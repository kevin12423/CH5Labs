/**
 * Created by kevin_000 on 2/1/2016.
 */
import java.util.Scanner;
public class AverageRainDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of years");
        int years = input.nextInt();
        int rain = 0;
        int totalRain = 0;
        int months = 0;
        double average = 0;
        if(years >= 1)
        {
            for (int x = 0; x < years; x++) {

                for (int y = 0; y < 12 * years; y++) {
                    System.out.println("How much rain fell this month?");
                    rain = input.nextInt();
                    if (rain >= 0)
                    {
                        totalRain += rain;
                        months = years * 12;
                        average = (totalRain / months);

                    }
                    else
                    {
                        System.out.println("Please enter a positive number");
                    }


                }
                System.out.println("Number of months " + months);
                System.out.println("Total rain fall " + totalRain);
                System.out.println("Average rain fall for all " + average);
            }
        }
        else
        {
            System.out.println("Please enter a positive number");
        }
    }
}
