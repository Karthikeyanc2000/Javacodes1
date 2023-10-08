
import java.util.Scanner;
public class Karthik {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1 [] ={1,10,55,7};
        num1 [2] = 21;

        int num2 [] = new int[4];
         for(int i =0;i<=num2.length-1;i++)
         {
            num2[i]=scanner.nextInt();
         }
         System.out.println("Your Array values are : ");
         for(int j=0;j<=num2.length-1;j++)
         {
            System.out.println(num2[j]);
         }

    }
    
}
