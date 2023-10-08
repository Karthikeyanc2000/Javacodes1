/*
 * using Lambda expression we can reduce the number of lines we have and
 * then there is no extra class.
 * 
 */

class A implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.println("hi");

            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.println("hello");

            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class D implements Runnable{
    public void run(){
        
    }
   
}

public class Karthik{
    public static void main(String [] args)
    {
        A obj1 = new A();


        Thread t1 = new Thread(obj1);
        t1.start();

        Runnable obj2 = new B();

        Thread t2 = new Thread(obj2);
        t2.start();

        //using anonymous class
        Runnable obj3 = new Runnable() {
            
            public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.println("hai hello");

            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
     };
     Thread t3 = new Thread(obj3);
     t3.start();

     //here runnable is functional interface,
     //so we can use Lambda expression
     Runnable obj4 = () ->  {

        for(int i=1;i<=10;i++)
        {
            System.out.println("Welcome");

            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
     };
     Thread t4 = new Thread(obj4);
     t4.start();    
    }
}