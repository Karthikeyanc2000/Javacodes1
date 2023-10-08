
/*
 * take input from user one by one till zero is not typed
 * at last display all the input in console
 * 
 * input: 
 * Enter value (0 to stop)
 * 77
 * 
 * Enter value (0 to stop)
 * 45
 * 
 * Enter value (0 to stop)
 * 77
 * 
 * Enter value (0 to stop)
 * 55
 * 
 * Enter value (0 to stop)
 * 0
 * 
 * output Entered value : 
 * 77 45 55 
 * 
 */

import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Karthik {
    public static void main(String [] args)
    {
        Set<Integer> set = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter Number (0 to exit.)");
            String value = scanner.nextLine();
            int number = Integer.parseInt(value);
            if(number == 0)
            {
                break;
            }
            else
            {
                set.add(number);
                System.out.println("Data added.");
            }

        }
        for(int o :set)
        {
            System.out.print(o+" ");
        }
    }
    
}
