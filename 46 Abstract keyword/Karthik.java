//there is no compulsion for a abstract class to must have a abstract method in it.
//a abstract class may or may not have a abstract method in it but,
//but we can't create object for a abstract class.
//we can create object for only a concreate class. But we can use that concrete class object to abstract class reference variable.

//When a class extends a abstract class it should provide the defenition for abstract method,
//otherwise the extended (child) class also abstract so we can't create object for abstract class.
//concreate class is a class which implements all methods and defines it.
//so we can create a object for concrete class

/*
 * use of abstract some time we can hide somthing that user need not to know
 * example: working of int x= 15;  here backend working is need not to known by user like this we can hide using abstract method.
 * 
 * 
 * The main use of the abstract keyword in Java is to support abstraction and create a 
 * framework for building classes with shared behavior while enforcing certain rules and 
 * contracts for derived classes.
 * 
 */

 //if we have one abstract method in our class then our entire class is abstract we can't create objects for abstract class.


 abstract class Car{
    public abstract  void drive();
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Music is playing");
    }
 }
 abstract class WagonR extends Car{
    public void drive()
    {
        System.out.println("Driving");
    }
 }

 class UpgradWagonR extends WagonR{  //Concrete class
    public void fly(){
        System.out.println("Flying");
    }
 }
public class Karthik {
    public static void main(String [] args)
    {
        Car c1 = new UpgradWagonR();
        c1.fly();
        c1.drive();
        c1.playMusic();

        WagonR a1 = new UpgradWagonR(); //here we assigning concete class object to abstract class referrence variable.
        a1.fly();
    } 
}
