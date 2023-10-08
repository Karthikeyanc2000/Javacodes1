//interface is not a class.
// by default all the methods inside the interface will be public abstract we need not to explecitly declare that as public abstract.

//interface just show you the design -----> we need to work for the design.

// we can have variables in interface but that variable is should  be final and static.
//we cant change the value of final variable that inside interface and then we can access them by just calling class name because it is static.
//so we can create variables in interface but it is final and static.


//In interface we not extending (extends), here we implements so only methods we can use in implemented class not variables form interface.
//so variables not comes from interface to implements class, only methods comes to implemented class.
//but in inheritance we use extends here extends means all the property comes into extended class.


// interface not have own memory in heap.

//in interface we can implements multiple classes but in abstract we can extend only one class.
//multiple inheritence is some what we can acheive using interface.

//we can have inheritance in interface using extends keyword.
//one interface can extend another interface.


interface A{
    int age = 55; //final and static
    //final means here itself we need to assign value it is not updatable in other class.
    String name ="John";

    void show();  //by default it is public abstract inside the interface.
    void config();
}

interface X {
    void run();
     }

  interface Y extends X{

  }

class B implements A,Y {
   public  void show(){
    System.out.println("In show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    public void  run()
    {
        System.out.println("In run");
    }
}

public class Karthik {
    public static void main(String [] args)
    {
        A obj1;
        obj1 = new B();
        obj1.config();;
        obj1.show();

        System.out.println(A.age+" "+A.name);
        // A.name ="cena"; //here it is error because in interface these variables are final.

        A obj2 ;
        obj2 = new B();
       //  obj2.run();  //here error because A interface dont know run method so run method is known by only X and Y interface so 
            //create reference variable to X and Y interface and assign a object of implemented class(B class).

        Y obj3 = new B();
        obj3.run();
           // obj.config();
        //but in Y we can't run show() and config() because it dont know that method it only knows run method.
    }
    
}
