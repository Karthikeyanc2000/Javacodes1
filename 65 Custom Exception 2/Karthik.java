

class navinException2 extends RuntimeException {

    public navinException2(){
        super();
    }
    public navinException2(String str)
    {
        super(str);//just pass the message to super class constructor they will take care of it.
    }

}
public class Karthik {
    public static void main(String [] args)
    {
        int i=80;
        int j=0;
        try{
            j=71/i;
            if(j==0)
            {
                throw new navinException2("I dont want to print zero ");
            }
        }
        catch(navinException2 e)
        {
            j=71/1;
            System.out.println("Thats the default output."+" "+e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong "+e);
        }
        finally{
            System.out.println("This is the finally block");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
    
}
