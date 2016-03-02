import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

/**
 * Created by kevin_000 on 2/2/2016.
 */
public class DepositFiles
{
    public static void main(String[] args) throws IOException
    {
        double interestRate = 0;
        double subtract = 0;
        double add = 0;
        DecimalFormat decFormat = new DecimalFormat("$#,##0.00");
        Scanner input = new Scanner(System.in);
        File myFile = new File("C:\\Users\\kevin_000\\Desktop\\Deposit.txt");
        Scanner inputFile = new Scanner(myFile);
        double depositOne = inputFile.nextDouble();
        double depositTwo = inputFile.nextDouble();
        double depositThree = inputFile.nextDouble();
        double depositFour = inputFile.nextDouble();
        File myFile2 = new File("C:\\Users\\kevin_000\\Desktop\\Withdrawals.txt");
        Scanner inputFile2 = new Scanner(myFile2);
        double withOne = inputFile2.nextDouble();
        double withTwo = inputFile2.nextDouble();
        double withThree = inputFile2.nextDouble();
        double withFour = inputFile2.nextDouble();
        double withFive = inputFile2.nextDouble();
        MoneyFiles account1 = new MoneyFiles();

        account1.setBalance(500);
        account1.setInterestRate(0.12);
        //deposits
        account1.setDeposit(depositOne);
        add += depositOne;
        account1.addingDeposit();
        account1.setDeposit(depositTwo);
        add += depositTwo;
        account1.addingDeposit();
        account1.setDeposit(depositThree);
        add += depositThree;
        account1.addingDeposit();
        account1.setDeposit(depositFour);
        add += depositFour;
        account1.addingDeposit();
        //withdraws
        account1.setWithdrawal(withOne);
        subtract += withOne;
        account1.subtractingWidthdrawal();
        account1.setWithdrawal(withTwo);
        subtract += withTwo;
        account1.subtractingWidthdrawal();
        account1.setWithdrawal(withThree);
        subtract += withThree;
        account1.subtractingWidthdrawal();
        account1.setWithdrawal(withFour);
        subtract += withFour;
        account1.subtractingWidthdrawal();
        account1.setWithdrawal(withFive);
        subtract += withFive;
        account1.subtractingWidthdrawal();

        account1.calcMonthly();
        interestRate += account1.calcMonthly();
        account1.calcInterest();

        System.out.println("Total Deposits " + decFormat.format(add));
        System.out.println("Total Withdrawals " + decFormat.format(subtract));
        System.out.println("Interest Rate " + decFormat.format(interestRate));
        System.out.println("Ending balance " + decFormat.format(account1.getBalance()));


        inputFile.close();
    }
}
