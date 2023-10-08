//Enum is a class but we can't extend it, appart from that all behaviours are same as of normal classes example creating method variables constructors etc...
//every class in java extends object class so only we can able to use some inbuild methods.
//Enum in java extends enum class so only we cam get some methods sugessions to our objects.-->(inbuild)
//make sure your instance variables are private.

//in enum constructor is private because we create object inside the class only.

enum Laptop{
    Macbook(2000),xps(2200),surface,thinkpad(1500);

    private int price; //make sure we using private for instance variable.

    private Laptop(){
        //this is default constructor for non argument object in enum.
        price = 500;
        System.out.println("Default constructor"+ " "+this.name());
    }

    private Laptop(int price){
        this.price = price;
        System.out.println("(int) parameterized constructor "+" "+this.name());
    }
    //here we using private constructors because here all objects are created inside enum class only.

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}


public class Karthik {
    public static void main(String [] args)
    {
        Laptop lap =Laptop.Macbook;
        System.out.println(lap+" "+lap.getPrice());

        System.out.println(lap.getClass().getSuperclass());

        for(Laptop l1 : Laptop.values())
        {
            System.out.println(l1+" : "+l1.getPrice());
        }

    }
    
}
