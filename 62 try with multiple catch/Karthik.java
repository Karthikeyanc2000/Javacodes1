//Exception is the super class in that we have lot of sub classes.

/*
 * In Java, a subclass is a class that inherits properties and behaviors 
 * (fields and methods) from another class, known as the superclass. 
 * Subclassing is a fundamental concept in object-oriented programming, 
 * and it allows you to create new classes that are based on existing classes, 
 * promoting code reuse and extending functionality.
 * 
 */


public class Karthik {
    public static void main(String [] args)
    {
        int i=2;
        int j=0;

        int arr [] = new int [5];
        String str = null;

        try{
            j=66/i;
           // System.out.println(str.length());
            System.out.println(arr[4]);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ivide by zero error "+ e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Know your limit "+e);
        }
        catch(Exception e)  //This is the super class(parent class) of exception so it can handle all types of exception.
        {  //so it is parent class exception it can handle all types of exception so it must kept in last catch block because if it kept in first then other catch block becomes unreachable code.
            System.out.println(e);
        }
        finally{
            System.out.println("This is finally block it executes in all situation of exception (if our code enters try block)");
        }
        System.out.println(j);
        System.out.println("Bye");

    }
}

//Exception class is parent class.
//throwable is the parent class of Exception class.


