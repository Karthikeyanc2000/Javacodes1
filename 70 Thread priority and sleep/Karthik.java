

class A extends Thread{
    public void run(){
        for(int i =1;i<=100;i++){
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
class B extends Thread{
    public void run(){
        for(int i =1;i<=100;i++){
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
public class Karthik {
    public static void main(String [] args)
    {
        A obj1 = new A();
        B obj2 = new B();
        obj1.setPriority(5);//here priority range from 1 to 10,  10 is most priority. (also we can use MIN_PRIORITY MAX_PRIORITY NORM_PRIORITY word for setting priority)
        obj2.setPriority(Thread.NORM_PRIORITY);
        
        System.out.println(obj2.getPriority());

        obj1.start();


        try{ //here we just giving time between two threads to start for print hai hello alternatively.
            //but nothing in our hand scheduler only will decide.
        Thread.sleep(5); 
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }


        obj2.start();

    }
}

/*
 * MIN_PRIORITY = 1
 * NORM_PRIORITY =5
 * MAX_PRIORITY = 10
 * 
*/

//threads are controlled by scheduler in OS (diffrent schedular has different algorithms to work with) we can just only suggest the schedular using priority what to done.
 

//it all depends upon the scheduler we can just make multiple threads only.