
    interface Computer{  //here we can use abstract or class but if we use interface means we are creating a layer here.
     void code();                        //deeply understand the code here.

    }

    class Laptop implements Computer {
        public void code()
        {
            System.out.println("Code in laptop");
        }
    }
    class Desktop implements Computer {
        public void code()
        {
            System.out.println("Code in Desktop");
        }
    }
     class Developer {
        public void devApp(Computer obj)
        {
            obj.code();
        }
    }

public class Karthik {
    public static void main(String [] args)
    {
        Developer navin = new Developer();
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        navin.devApp(lap);
        navin.devApp(desk);

        Computer com;
        com = new Laptop();
        com.code();

        com = new Desktop();
        com.code();


       //below is the use of interface
        Computer lapcom = new Laptop();
        Computer deskcom = new Desktop();
        Developer navinreddy = new Developer();
        navinreddy.devApp(lapcom);
        navinreddy.devApp(deskcom);
    }
    
}
