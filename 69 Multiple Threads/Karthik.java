
/*
 * In Java, "threads" refer to the basic unit of execution in a multi-threaded program. 
 * A thread is a lightweight sub-process that allows a Java application to perform multiple 
 * tasks concurrently. Threads are used to achieve parallelism and concurrency in Java programs, 
 * which can lead to improved performance and responsiveness.
 * 
 */
class A extends Thread{
    public void run(){
        for(int i =1;i<=100;i++){
        System.out.println("hi");
    }
}
}
class B extends Thread{
    public void run(){
        for(int i =1;i<=100;i++){
        System.out.println("hello");
        }
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

    }
}
