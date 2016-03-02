/**
 * Created by kevin_000 on 2/1/2016.
 */
public class Population
{
        private int numOfOrganisms;
        private int numOfDays;
        private double rateOfIncrease;

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public void setNumOfOrganisms(int numOfOrganisms) {
        this.numOfOrganisms = numOfOrganisms;
    }

    public void setRateOfIncrease(double rateOfIncrease) {
        this.rateOfIncrease = rateOfIncrease;
    }


    public void calcPopulation()
    {

        double population = 0;
        int day = 1;
        for (int x = 1; x <= numOfDays; x++) {
           population = numOfOrganisms + (numOfOrganisms * (rateOfIncrease / 100) * x);

            System.out.println("Day " + day + " " + population);
            day++;
        }



    }
}
