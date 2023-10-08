//Dynamic method dispatch is also an example for runtime polymorphism.(we know only during runtime)

class Computer{
    public void show()
    {
        System.out.println("in computer show");
    }
}
 class Laptop extends Computer{

 }

 class Laptop2 extends Computer{
    public void show()
    {
        System.out.println("in Laptop2 show");
    }
}
 class Tablet {
    
 }

public class Karthik{
    public static void main(String [] args)
    {
        Laptop lap = new Laptop();
        lap.show();
        Computer com = new Laptop();
        com.show();
        //above thing is we already now 
        //as child class is empty also it is having parent behaviours(methodes and variables).

        new Computer().show();//this is anonymouse object that also we know.

        Tablet tab = new Tablet();
        new Tablet();

       //below code is the example for Dynamic method dispatch.
        Computer c = new Computer();
        c.show();

        c= new Laptop2();
        c.show();

        c= new Laptop();
        c.show();  // so the same object reference c is behaving different with different objects.
        //because it is referring, so it pointing new object dynamically.
        //so it is dynamic memory dispatch.

     //important point is that irrespective of what variable we create its all depends,
     //up on what object we assign to it and it is only possible wen we have inheritance.

      //   c= new Tablet();// here error cannot convert from tablet to computer error is shown.
      //   c= new Tablet(); //if Tablet class is inherited then this will works. 
    }
}