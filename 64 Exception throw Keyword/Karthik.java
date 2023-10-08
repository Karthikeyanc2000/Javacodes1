//throw key word is used to throw the exception and the catch block will catch the exception.
public class Karthik {
    public static void main(String [] args)
    {
        int i=22;
        int j=0;

        try{
            j=18/i;
            if(j ==0)
            {
                throw new ArithmeticException("I dont want to print Zero");
            }
        }

        catch(ArithmeticException e)
        {
            j=18/1;
            System.out.println("thats the default output" +" "+e);
        }

        catch (Exception e)
        {
            System.out.println("Something went wrong"+ e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
    
}
