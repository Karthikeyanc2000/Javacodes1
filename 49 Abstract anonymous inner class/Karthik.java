
abstract class A{
    public abstract void show();
    public abstract void config(); 
}
public class Karthik {
    public static void main(String [] args)
    {
        A a1 = new A() //we can't create object for abstract class but here it not a object of abstract class
        //it is a object of the inner anonymous class.(so only here we can able to create a object).
        {
            public void show()
            {
                System.out.println("in show of inner class");
            }
            public void config()
            {
                System.out.println("in config of inner class");
            }
        };
        
        a1.config();
        a1.show();
    }
    
}
