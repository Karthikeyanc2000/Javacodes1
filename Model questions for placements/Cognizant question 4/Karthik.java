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
 * 77 45 77 55 
 * 
 */

 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
//we should import the packages what we needed only not all using * because in big project it will create problem in runtime.
public class Karthik {
    public static void main(String [] args)
    {
        List<Integer> value = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter number (0 to stop)");
        String num = scanner.nextLine();
        int number =Integer.parseInt(num);
        if(number!=0)
        {
            value.add(number);
            System.out.println("Value add.");
        }
        else 
        {
            break;
        }
    }
    System.out.println("Your values are : ");
    for(int val :value)
    {
        System.out.print(val+" ");
    }
    }
    
}
