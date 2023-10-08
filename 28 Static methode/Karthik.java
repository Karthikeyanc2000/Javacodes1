//main methode is static because, if main is not static means it need to be instantiated.
//example, every time before our code stars we need to instanciate the class were our main methode is present
//but it is not posible to create a class object without starting a code 
//it is a deadlock
//for preventing this deadlock we use our main methode as static so no need for instantiating.


//we can call static variable inside static methode no problem.
// but non static variable inside a static methode means we need to pass object,
//becuse it should know which object now we calling or using.

class Mobile{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand+" "+price+" "+name);
    }
    public static void show1(Mobile m)
    {
        System.out.println(m.brand+" "+m.price+" "+name);
    }
}
public class Karthik {
    public static void main(String [] args)
    {

        Mobile mob = new Mobile();
        mob.price=15000;
        mob.brand="Apple";
        Mobile.name="iphone 15";

        Mobile mob2 = new Mobile();
        mob2.brand="Redme";
        mob2.price=20000;
        Mobile.name="Note 25";

       // Mobile.show() // ERROR
       // non static methode cannot be called using class name, it is called using object name.
       mob.show();
       mob2.show();
       Mobile.show1(mob2);

    }
    
}
