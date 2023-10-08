/*
 * Given a string you have to print that String each word first letter
 * 
 * input : "Today weat777her is good75465"
 * output : Twig
 * 
 * input : "Java Virtual Machine"
 * output : JVM
 */

 import java.util.Scanner;
public class Karthik {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String value = scanner.nextLine();

        String a [] = value.split("[\\s]+");//here spliting using extra spaces between two words.(This is the regular expression will match one or more white space character).

        for(String b : a)
        {
            System.out.print(b.charAt(0));
        }
    }
    
}
