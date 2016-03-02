/**
 * Created by kevin_000 on 2/3/2016.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;
public class FileDisplay
{
            public FileDisplay(String fileName)
            {


            }

    public String displayHead()
    {
        String name = "";
        File myFile = new File("fileName");
        Scanner input = new Scanner("fileName");
        for (int x = 0; x < 5; x++)
        {
            if(input.hasNext())
            {
               name = input.nextLine();
            }
        }
            return name;



    }
    public String displayContents()
    {
        String name = "";
        File myFile = new File("fileName");
        Scanner input = new Scanner("fileName");
        while (input.hasNext())
        {
            name = input.nextLine();
            System.out.println(name);
        }
        return name;

    }
    public void displayWithLineNumbers()
    {
        String name = "";
        File myFile = new File("fileName");
        Scanner input = new Scanner("fileName");
        do
        {
            int num = 0;
            num++;
            System.out.println(num + ":" + name);

        }
        while (input.hasNext());
    }




}
