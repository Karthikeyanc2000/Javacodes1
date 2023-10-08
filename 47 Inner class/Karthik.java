

//if  we want to use a non static methode then we must need to create a object for that.
 class A{
    int marks =400;
    public void show()
    {
        System.out.println("In show");
    }

    class B
    {
        public void config(){
            System.out.println("in config of B class in side A class");
        }
    }
     static class C
    {
        public void func(){
            System.out.println("in func of static class C inside class A");
        }
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        A a1 = new A();
        a1.show();

        A.B b1 = a1.new B(); //here a1 is a object for non static methode inside B class.
        //a1 is the object of A class similarly if we want to create a object for B class we need
        //a object of A class to call B class and create a object for B class.
        b1.config(); 

        //now for static inner class we not need object we can call by class name itself.

        A.C c1 = new A.C();
        c1.func();
    } 
}

      //can we have static class?
/*
 * YES, but static can be used only for the inner classes.
 * what is the use of static class.
 * a static class is a class which object can not be created normally and we can inherit static inner class normally.
 * 
 * for code secratability.
 * 
 * 
 * static class are used as a containers for static members like methods, 
 * constructors and others.
 * 
 * 
 * 
 * 
 * 
 * While it's true that you cannot create an instance of a static nested class using the 
 * new keyword directly, you can create an instance of a static nested class through the 
 * outer class. For example, if you have an outer class Outer and a static nested class Inner, 
 * you can create an instance of Inner like this: Outer.Inner innerObject = new Outer.Inner();.
 * 
 * 
 * Static nested classes can be inherited, but they are not associated with any instance of the 
 * outer class. Inheritance applies to the static members and methods of the class.
 * 
 * 
 * 
 */

