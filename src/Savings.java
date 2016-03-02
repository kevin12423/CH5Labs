import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created by kevin_000 on 2/2/2016.
 */
public class Savings
{
        private double interestRate;
        private double balance;
        private double deposit;
        private double withdrawal;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

    public double getBalance() {
        return balance;
    }


    public double subtractingWidthdrawal()
    {

        balance -= withdrawal;
        return balance;
    }
    public double addingDeposit()
    {
        balance += deposit;
        return balance;
    }
    public double calcInterest()
    {
       balance += calcMonthly();
        return balance;

    }
    public double calcMonthly()
    {
        double month=0;
        month = interestRate / 12 * balance;
        return month;
    }
}
