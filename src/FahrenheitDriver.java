/**
 * Created by kevin_000 on 2/2/2016.
 */
public class FahrenheitDriver
{
    public static void main(String[] args)
    {
        double num = 0;
        double far;
        for (int x = 0; x < 21; x++)
        {
            far = ((1.8) * x) + 32;
            System.out.println("");
            System.out.println("Temp in C " + x);
            System.out.println("Temp in F " + far);

        }


    }


}
