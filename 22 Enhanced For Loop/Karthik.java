import java.util.Scanner;
public class Karthik {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1 [] = new int [5];

        for(int i=0;i<num1.length;i++)
        {
            num1[i] = scanner.nextInt();
        }
        System.out.println("Below output is from enhanced for loop (Foreach Loop) : ");

        for(int obj : num1)
        {
            System.out.println(obj);
        }
        scanner.close(); // here sometimes warring will come if we not close scanner.

    }
    
}
