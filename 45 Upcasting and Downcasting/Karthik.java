//normally implecitly java use Upcasting 
//if we want to use downcasting we should use explecitly.

class A{
    public void show1()
    {
        System.out.println("in class A show1");
    }
}
class B extends A{
    public void show2()
    {
        System.out.println("in class B show2");
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        A a1 = new A();
        a1.show1();
          //a1.show2(); //error because A class don't now show2() method is available or not.

          //  B b1 = new A(); //This is error we can't do this.


        //UPCASTING
        A a2 = new B(); //this is implecitly doing it is like A a2 = (A) new B();
        A a3 = (A) new B();  //it is upcasting normally if we not specify (A) also it will work.
        a3.show1();
        //Here moving up from B class object we assigning to A class.
        

        //DOWNCASTING
                b bb; //it is just a refference it will not point anything.
                //  bb.show2(); //ERROR 
        B b1 = (B) a3; //here we downing the A class object to work for B class referrence.
        b1.show2();

        //These are also a type of type casting
        //  B bbb = new A();  //ERROR this also similar to int float story //we cant assign a parent class object to child class referrence variable.
            A aaa = new B(); //this will work

            /*
             * we cant assingn super class object to sub class reference.
             * eg:
             *     b bbbb = new A(); //error because b is sub class and A is super class.
             */
    }
    
}
