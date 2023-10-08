
//static means non moveable.
//static variable is common to all the classes.
//we can call that static variable using class name.(Mobile1.name)

class Mobile1{
    String brand;
    int price;
    static String name;  // it is availabele to al class as single object.

    public void show1()
    {
        System.out.println(brand+" "+price+" "+name); // we can use this also (this.name)
    }
}
class Mobile2{
    public void show2()
    {
        //System.out.println(name);  //ERROR 
        System.out.println(Mobile1.name); // correct calling of static variable.
        Mobile1 mob = new Mobile1();
        System.out.println(mob.name); // This is not a good practice of calling static variable.
        //we should call a static variable using class name only (we should not call by its object)
    }
}
class Mobile3{
    String brand;
    int price;
    static String name;

    public static void show(Mobile3 mob3){
        System.out.println(mob3.brand+" "+mob3.price+" "+name);
        //System.out.println(brand+" "+this.price+" "+name); //Error we cant use this in static.
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        Mobile1 mob2 = new Mobile1();
        mob2.brand="samsung";
        mob2.price=15000;
       // mob1.name="Galaxy 15"; // It is not a good practice of using static variable.
       //it will create a warning.
       Mobile1.name="Galaxy 10";
       mob2.show1();

       Mobile1 mob3 = new Mobile1();
       mob3.brand="Apple";
       mob3.price=55000;
       Mobile1.name="iphone 15";

       mob2.show1();
       mob3.show1();    

       Mobile3 m = new Mobile3();
       m.brand ="Redmi";
       m.price = 20000;
       //m.name = "note 15"; //This is not a good practice of using static variable.
       Mobile3.name = "note 5";
       
       Mobile3.show(m);
    }
    
}
