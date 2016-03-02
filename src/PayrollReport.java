/**
 * Created by kevin_000 on 2/1/2016.
 */
public class PayrollReport
{
        private int id;
        private double grossPay;
        private double stateTax;
        private double federalTax;
        private double fica;

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    public void setFica(double fica) {
        this.fica = fica;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    public void calcPayroll()
    {
        double netPay = grossPay - stateTax - federalTax - fica;
        System.out.println("Net pay: $" +netPay);
    }

    public int getId() {
        return id;
    }
}
