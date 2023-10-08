



//throws keyword working like->[ i don't know check with my main method or my handeling method].
//we should not use throws keyword with main method because main method is handled by JVM so main method said i don't know ask my handeling person Jvm means JVM simply it will stops the execusion.
//so we should not throws exception in main method.
//insted of throwing the exception in main method we can use try catch and we can handle it.


class A  {
    public void show() throws ClassNotFoundException { //here main should handle the exception(because it throws to it).
       Class.forName("calc");
    }
    
}  
class calc{
    static{
        System.out.println("calc class loaded");
    }
}

public class Karthik {  //this class is always loaded because here only main method is there.
    static{
        System.out.println("Class is Loaded");
    }
    public static void main(String [] args){ //don't throw any exception from main method because it send to JVM to handle.

        try{
            A obj = new A();
            obj.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
