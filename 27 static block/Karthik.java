//class loads only one time but objects are instanciated many times.
//There is no use of calling static variable inside constructor because it is same for all object.
//because of that there is a new block called static block.
//static block is called first and before constructor.
//static block is called when a class is loaded.
//but a class is loaded only once and object instantiation happens many times.
//static block is called only once.

class Mobile
{
    String brand;
    int price;
    static String name; 
    //There is no use for a static variable to instantiate or call inside constructor.

    public Mobile(){
        brand="";
        price=15000;
        System.out.println("in constructor");
    }

    static{
        name="iphone";
        System.out.println("in static block");
    }

    public void show()
    {
        System.out.println(brand+" "+name+" "+price);
    }

}
public class Karthik {
    public static void main(String [] args) throws ClassNotFoundException
    {

      // Class.forName("Mobile");   //output: in static block.
      //here it is an example we took for just loading the class.

        Mobile mob = new Mobile();
        Mobile mob2 = new Mobile();

        mob.show();
        mob2.show(); 

    }
}

// In java the code is not runing in the order what we typing.