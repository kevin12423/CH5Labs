/**
 * Created by kevin_000 on 1/29/2016.
 */
import java.io.*;
import java.util.Scanner;
public class DistanceDriver
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the speed you traveled");
        int speed = keyboard.nextInt();
        System.out.println("Please enter the time you traveled for");
        int time = keyboard.nextInt();
        Distance car1 = new Distance();
        car1.setSpeed(speed);
        car1.setTime(time);
        if(speed > 0 && time >= 1)
        {
            PrintWriter outPutFile = new PrintWriter("C:\\Users\\kevin_000\\Desktop\\SpeedCal.txt");
                for (int x = 1; x <= time; x++)
                {
                    outPutFile.println(car1.calcDistance() / time * x);
                    System.out.println(car1.calcDistance() / time * x);
                }
            outPutFile.close();
        }
        else
        {
            System.out.println("Please enter at least an hour and a positive number for speed");
        }

    }
}
