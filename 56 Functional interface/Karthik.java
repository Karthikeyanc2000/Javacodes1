//Functional interface means that interface should have only one abstract method in it.

@FunctionalInterface
interface A {
    void show();
}

        // class B implements A{
        //     public void show()
        //     {
        //         System.out.println("in show of implemets class");
        //     }
        // }
//here we can implements our functional interface using anonymous inner class also (this is best).
public class Karthik {
    public static void main(String [] args)
    {
        A obj = new A() //here we not instantiating interface, here we instantiating the inner class that implements interface.
        {  //this is anonymous inner class.
            public void show(){
                System.out.println("in show of anonymous inner class");
            }
        };
        obj.show();
    } 
}

/*
 * 
 * 
 * 
 * -->A obj = new A() { ... };: Here, you are creating an instance of an anonymous inner class 
 *    that implements the A interface. This anonymous inner class provides an implementation of 
 *    the show method.
 * -->obj.show();: You are calling the show method on the obj reference, which points to an 
 *    instance of the anonymous inner class.
 * 
 *   So, your code correctly demonstrates the use of an anonymous inner class to implement 
 *   the A interface and override its show method. This technique is often used when you 
 *   need to provide a one-time implementation of an interface or extend a class without creating 
 *   a named subclass.
 * 
 * 
 */
