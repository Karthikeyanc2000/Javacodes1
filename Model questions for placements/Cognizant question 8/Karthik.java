
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;



public class Karthik {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> value = new HashMap<String,Integer>();

        while(true)
        {
            System.out.println("Enter country name : ");
            String country = scanner.nextLine();
            System.out.println("Enter Population of the country :");
            int polupation = Integer.parseInt(scanner.nextLine());
            value.put(country,polupation);
            System.out.println("Data added.");
            System.out.println("Continue(Y/N)");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("n"))
            {
                break;
            }
        }
        for(String key : value.keySet())
        {
            System.out.println(key+ " : "+value.get(key));
        }
        scanner.close();
    }
    
}
