



//when you want to access something outside the package make it as public,
//due to this most of the time methods are public but variables may not public.

// private key word means we can use it only inside the class.
//private means inside the class only irrespective of packages (here packages is secondary).

//default key word means we can access only to packages.


//protected key word means
// we cannot access outside the package but 
//we can access outside the packages if the class is child class. 


//avoid using default 
//use public for class
//use private for instance variables.
//use public for needed methods and can use protected for that method used only by child class.


//we cant have two public class in side a same file because,
// we should have only one class in one folder (to promote that java show error if two public class in same file).
import mypack1.*;

public class Karthik extends A {
    public static void main(String [] args)
    {
        A a2 = new A ();
     //   System.out.println(a2.total+" "+a2.cgpa);

    }
    
}

/*  
 *                                        private       protected     public       default 
 * same class                              yes            yes          yes           yes
 * same package sub class                  no             yes          yes           yes          
 * same package non-subclass               no             yes          yes           yes 
 * different package subclass              no             yes          yes           no
 * different package non-subclass          no             no           yes           no
 */



