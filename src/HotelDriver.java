/**
 * Created by kevin_000 on 1/29/2016.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class HotelDriver
{
    public static void main(String[] args)
    {
        int totalRooms = 0;
        int totalOccupied = 0;
        int roomNumber = 0;
        int usedRooms = 0;
        int vacant = 0;
        double rate = 0.0;
        System.out.println("How many floors does the hotel have?");
        Scanner keyboard = new Scanner(System.in);
        int floors = keyboard.nextInt();
        int floorLine = 1;
        if(floors >= 1)
        {
            for (int x = 0; x < floors; x++) {
                System.out.println("How many rooms are on floor:" + floorLine + "?");
                roomNumber = keyboard.nextInt();
                if (roomNumber >= 10)
                {
                    System.out.println("How many rooms are occupied?");
                    usedRooms = keyboard.nextInt();
                    totalRooms += roomNumber;
                    totalOccupied += usedRooms;
                    vacant = totalRooms - totalOccupied;
                    rate = (double) totalOccupied / totalRooms;

                    floorLine++;
                }
                else {
                    System.out.println("Please enter at least 10 rooms");
                }
            }
            System.out.println("The hotel has " + totalRooms + " rooms with " + totalOccupied + " being occupied and " + vacant + " being vacant with the occupancy rate being " + (rate * 100) + "%");
        }

    }
}
