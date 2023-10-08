
import mypack1.*;
import mypack1.A;

public class c extends A{
    //here this is a different package but sub class so here protected and public only works.
    A a1 = new A();

    public void show()
    {
    //  System.out.println(a1.age);
    // here it is default modifier it will work only in same package so error.
    System.out.println(a1.total+" "+a1.cgpa); //why this error.
    System.out.println(a1.total);
    }
    
     
}
