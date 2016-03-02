/**
 * Created by kevin_000 on 2/2/2016.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class SavingsDriver
{
        public static void main(String[] args)
        {
            double interestRate = 0;
            double subtract =0;
            double add =0;
            DecimalFormat decFormat = new DecimalFormat("$#,##0.00");
            Scanner input = new Scanner(System.in);
            Savings account1 = new Savings();
            System.out.println("What is the annual interest rate");
            double interest = input.nextDouble();
            account1.setInterestRate(interest);
            System.out.println("What is the balance");
            double balance = input.nextDouble();
            account1.setBalance(balance);
            System.out.println("How many months have passed?");
            int time = input.nextInt();
            for (int x = 0; x < time; x++ )
            {
                System.out.println("How much did you deposit this month?");
                double deposit = input.nextDouble();
                account1.setDeposit(deposit);
                add += deposit;
                account1.addingDeposit();
                System.out.println("How much did you withdrawal");
                double withdrawal = input.nextDouble();
                account1.setWithdrawal(withdrawal);
                subtract += withdrawal;
                account1.subtractingWidthdrawal();
                account1.calcMonthly();
                interestRate += account1.calcMonthly();
                account1.calcInterest();



            }
            System.out.println("The ending balance is " + decFormat.format(account1.getBalance()));
            System.out.println("The total amount of deposits is " + decFormat.format(add));
            System.out.println("The total amount withdrawn is " + decFormat.format(subtract));
            System.out.println("The total interest earned is " + decFormat.format(interestRate));



        }
}
