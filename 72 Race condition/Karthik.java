/*
 * mutation means change something.
 * Threads - if we want to make things faster Threads are good.
 * Threads and mutations is not a good idea,
 * if we are working with threads make sure that we are working with mutable data.
 * ex.if one person having two atm card of same bank account and at a same time using that two atm card to withdraw money means think.
 * ex2.two threads working with same variable i, so now the variable i is instable(instability to our code).
 * 
 * 
 * Thread safe -> means one thread that can work with that at one point.
 */

 //now we see how to work with two threads with shared variable.

 class Counter{
    int count =0;
    public synchronized void increment(){
        //if we not using synchronized key word here means at sametime two threads are comes to increment method and increment at only once.
        //ex.t1 0+1=1, t2 1+1=2 now t1,t2 2+1 = 3 here two threads are incrementing (same time) only one time(once).
        //to sync the increment here we using synchronized keyword.
        //so this synchronized keyword in java makes sure that this increment is called only one method(thread) at a time.(if t1 is working with increment t2 has to wait)
        count++;
    }
 }

// we should use only runnable interface for thread, if we create our own interface then we use inner class and pass that reference to thread() means that will give error,
//so we should use only runnable interface for threads.   //important 

public class Karthik {
    public static void main(String [] args) throws InterruptedException 
    {
        Counter c = new Counter();
        
        //here we should use only Runnable interface (no other).
        Runnable obj1 = new Runnable() 
              //here we not not creating a object for interface we now created object for our inner class.
              //or we can use Lambda expression.
        {
            public void run(){
            for (int i=1;i<=10000;i++)
            {
                c.increment();
            }
        }
        };

        Runnable obj2 =() ->{
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

//here we using join means we telling our main thread to wait untill all the two threads 
//to complete its work and then you do your next work like that.
//(so our main thread is waiting and then printing count after completing all two threads.)


//what ever we saying to wait sometime we can't get final count value(20000)because threads are not in our control.
//but we can use synchronized keyword in our method declaration.    (now all threads are synced) //output : 20000

        t1.join();  
        t2.join();

        System.out.println(c.count);
    } 
}
