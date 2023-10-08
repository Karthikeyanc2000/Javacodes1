
class A {
    public void show()
    {
        System.out.println("in A class show");
    }
}
public class Karthik {
    public static void main(String [] args)
    {

     A a1 = new A() //this is anonymous inner class.
     {

     public void show()
      {
       System.out.println("in new show");
      }

     };

        a1.show();

    }
    
}
