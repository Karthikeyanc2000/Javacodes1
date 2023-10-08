//by default java import    import java.lang.*;     this is auto import.(we cant see it) (but we can import it explicitly)


/*
 * System.out.println();
 * here println() method is from printStream class.
 * printStream is having its object name as out created inside System class as this object is created as static variable,
 * we using System.out.println();
 */

 //it is always  good to close the resources ex.scanner.close(),  etc......
 //otherwise there may be leaking of resources or leaking file etc......
 //normally if we using the resource, then others no able to use it because we keeping the resource busy so please close the resource(Dont be a evil person here).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Karthik {
    public static void main(String [] args) throws NumberFormatException, IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);

        System.out.println("Enter value for num : ");
        int num =Integer.parseInt(bf.readLine());
        System.out.println(num);

        //here BufferedReader is hard to use so Scanner is using nowadays.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for num2 : ");
        int num2 = scanner.nextInt();
        System.out.println(num2);
        //we have many function in Scanner.



        //better to get input as String format and convert it to our desired format.
        //ex.
        int sample1 =Integer.parseInt(scanner.nextLine());
        System.out.println(sample1);
        double sample2 =Double.parseDouble(scanner.nextLine()); //double is twice the size of float.
        System.out.println(sample2);
        float sample3 =Float.parseFloat(scanner.nextLine());
        System.out.println(sample3);
        char sample4 = scanner.next().charAt(0);
        System.out.println(sample4);
        String sample5 = scanner.nextLine();
        System.out.println(sample5);
        boolean sample6 = Boolean.parseBoolean(scanner.next());
        System.out.println(sample6);
        long sample7 = Long.parseLong(scanner.next());
        System.out.println(sample7);
        short sample8 = Short.parseShort(scanner.next());
        System.out.println(sample8);
        byte sample9 = Byte.parseByte(scanner.next());
        System.out.println(sample9);

        scanner.close();
        bf.close(); //we should always close the resources at the end only other wise there may be runtime error happen.
        
    }
    
}