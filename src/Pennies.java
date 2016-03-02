/**
 * Created by kevin_000 on 1/29/2016.
 */
public class Pennies
{
        private double pay;
        private int daysWorked;

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public int getDaysWorked() {
        return daysWorked;
    }
    public void calcPay()
    {
        int day = 1;
        for (int x = 1; x < daysWorked; x++)
        {
            pay*=2;
            ++day;

            System.out.printf("Day %d $%,.2f  \n",day, (pay / 100));

        }
    }
}
