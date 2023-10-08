
class A{
    public void show()
    {
        System.out.println("Show inside class A");
    }

}
class B extends A{
      public void show()
    {
        System.out.println("Show inside class A");
    }
    public void config()
    {
        System.out.println("config inside class B");
    }
}

interface C{
    void show();

}
class D implements C{
    public void show()
    {
        System.out.println("show inside class C");
    }

}

abstract class E{
    public abstract void show();
}

class F extends E {
    public void show()
    {
        System.out.println("This is the show method inside F class which implemtes the abstract class E");
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        A obj1 = new B();
        obj1.show();
      //  obj1.config(); //here error because our reference variable is of class A so it knows only show() method. it dont know about config() method.

      B obj2 = (B) obj1;
      obj2.config();  // now it will work because we doing downcasting.

      C obj3 = new D();
      obj3.show(); // this is reference variable from interface and object of implemnted class so it will work.
      
      E obj4 = new F();
      obj4.show();

    //  B obj5 = new A(); //here error because, we cant assign a parent class object to child class reference variable.(it is against rule of java).
      
                /*
                 * Explanation for above confusion.
                 * 
                 * Java enforces type safety and follows the principles of inheritance, 
                 * which is why you cannot directly assign a parent class object to a  
                 * child class reference variable. If you need to work with a child class 
                 * object using a child class reference, you should create an instance of the 
                 * child class itself.
                 * 
                 * 
                 */
    }
    
}
