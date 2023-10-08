

class NavinException extends Exception{  //here we can extends exception or runtimeException

    //create constructor for handiling the string input from throw.
    //now that string is not handled by this class but it is handled by exception class.
    //so sent that string to super class constructor.
    public NavinException(String str){
        super(str); //here we passing the string to super class constructor.
       // System.out.println("Hai this is NavinException cunstructor. "+" : "+str);
       
       //this str we can print here but we should call super class constructor that is rule.
    }

}
public class Karthik {
    public static void main(String [] args)
    {
        int i = 75;
        int j=0;

        try{
            j=54/i;
            if(j==0)
            {
                throw new NavinException("I dont want to print zero."); //this is handeled by Exception class we should pass this string to super class constructor (Exception class constructor).
            }
        }
        catch(NavinException e)
        {
            System.out.println("Thats the default output "+e);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong "+e);
        }
    }
    
}
