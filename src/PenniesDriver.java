/**
 * Created by kevin_000 on 1/29/2016.
 */
import java.util.Scanner;
public class PenniesDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the pay for the first day");
        double pay = keyboard.nextDouble();
        System.out.println("please enter the number of days you worked");
        int days = keyboard.nextInt();
        Pennies penny = new Pennies();
        penny.setPay(pay);
        penny.setDaysWorked(days);
        if(days >= 1)
        {
            System.out.printf("Day 1 $%,.2f  \n", pay / 100);
            penny.calcPay();
        }
        else {
            System.out.println("Please enter a number of 1 or greater for days worked");
        }
    }
}
