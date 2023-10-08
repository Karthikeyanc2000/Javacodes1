
public class Karthik {
    public static void main(String [] args)
    {
        int i=0;
        int j=0;

        try{
            j=75/i;
        }
        catch (Exception e)
        {
            System.out.println("Some thing went wrong" +e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
    
}
