/**
 * Created by kevin_000 on 2/1/2016.
 */
import java.util.Scanner;
public class PopulationDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the starting number of organisms");
        int organisms = input.nextInt();
        Population pop1 = new Population();
        pop1.setNumOfOrganisms(organisms);
        if(organisms >= 2) {
            System.out.println("Please enter average daily population increase as a percent, without the %");
            double rate = input.nextDouble();
            pop1.setRateOfIncrease(rate);
            if(rate >= 0) {
                System.out.println("Please enter the number of days");
                int days = input.nextInt();
                pop1.setNumOfDays(days);
                if(days > 1) {
                    pop1.calcPopulation();
                }
                else
                {
                    System.out.println("Please enter at least 1 day");
                }
            }
            else
            {
                System.out.println("Please enter a positive number");
            }
        }
        else
        {
            System.out.println("Please enter at least 2 organisms");
        }



    }
}
