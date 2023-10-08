

class A{
    int count=0;
    public synchronized void increment()
    {
        count++;
    }
}
interface B{
    void increment();
}
public class Karthik {
    public static void main(String [] args)
    {
        A obj1 = new A();

        Runnable r1 =()->
        {
        for(int i=1;i<=10000;i++)
        {
            obj1.increment();
        }
    };
        B r2 =()->
        {
        for(int i=1;i<=10000;i++)
        {
            obj1.increment();
        }
    };
            Runnable r3 =()->
        {
        for(int i=1;i<=10000;i++)
        {
            obj1.increment();
        }
    };

     Thread t1 = new Thread(r1);
   // Thread t2 = new Thread(r2);   //here error is comming 
                                    //telling to use runnable 
     
     Thread t3 = new Thread(r3);

     t1.start();
     t3.start();

     try {
        t1.join();
        t3.join();
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    System.out.println(obj1.count);
     

    
    }
    
}
