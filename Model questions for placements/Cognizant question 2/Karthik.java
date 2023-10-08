/*
 * check wether the pan is valid or not if it is valid print "PAN is Valid"
 * or throw YourPanInvalidException wich displays "Your PAN is Invalid".
 * 
 * input: ABCDE123K
 * output : PAN is Valid
 * 
 * 
 * input: ABCD1234K
 * output : Your PAN is InValid
 */

 import java.util.Scanner;

public class Karthik {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yor PAN : ");
        String pan = scanner.nextLine();
        String expr ="^[A-Z]{5}[0-9]{3}[A-Z]{1}$";

        try{ //we should shold handle using try catch we should not throw this error to main.
        if(pan.matches(expr))
        {
            System.out.println("PAN is Valid");
        }
        else 
        {
            throw new YourPanInvalidException("Your PAN is Invalid");
        }
    }
    catch(YourPanInvalidException e)
    {
       // System.out.println(e);
       //here we can use e.getMessage();
       System.out.println(e.getMessage());
    }
    finally{
        scanner.close();
    }
    }
}

class YourPanInvalidException extends Exception{
    public YourPanInvalidException(String message)
    {
        super(message);
    }
}
