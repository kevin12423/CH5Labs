/**
 * Created by kevin_000 on 2/1/2016.
 */

import java.util.Scanner;

public class PayRollReportDriver
{
    public static void main(String[] args)
    {
        int id;
        do
        {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter an ID number or 0 to exit ");
            id = input.nextInt();
            if (id != 0)
            {
                System.out.println("Please enter the gross pay");
                double gross = input.nextDouble();
                if (gross > 0)
                {
                    System.out.println("Please enter the state tax");
                    double state = input.nextDouble();
                    if (state > 0 && state < gross)
                    {
                        System.out.println("Please enter the federal tax");
                        double federal = input.nextDouble();
                        if (federal > 0 && federal < gross)
                        {
                            System.out.println("Please enter the fica");
                            double fica = input.nextDouble();
                            if (fica > 0 && fica < gross)
                            {
                                PayrollReport emp1 = new PayrollReport();
                                emp1.setId(id);
                                emp1.setGrossPay(gross);
                                emp1.setStateTax(state);
                                emp1.setFederalTax(federal);
                                emp1.setFica(fica);
                                emp1.calcPayroll();
                                if (state + federal + fica > gross)
                                {
                                    System.out.println("Please enter correct data");
                                }
                            } else
                            {
                                System.out.println("Please enter correct data");
                            }
                        } else
                        {
                            System.out.println("Please enter correct data");
                        }

                    } else
                    {
                        System.out.println("Please enter correct data");
                    }
                } else
                {
                    System.out.println("You have exited");
                }
            }


        }
        while (id != 0);
    }
}
