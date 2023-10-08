/*
 * print the string without vovels in it.
 * 
 * input: johncena12345
 * output : jhncn12345
 * 
 * input : siddharth4578
 * output : sddhrth4578
 */

 import java.util.Scanner;;
public class Karthik {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String here : ");
        String value = scanner.nextLine();
        char arr [] = value.toCharArray();

        String val = "bcdfghjklmnpqrstvwxyz1234567890";

        for(char v : arr)
        {
            if(val.indexOf(v)!=-1)
            {
                System.out.print(v);
            }
        }
    }
    
}
