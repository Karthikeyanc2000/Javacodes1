// Must see the picture of stack and heap inside jvm (explained by telusko youtube channel)


class Calculator
{
    int num = 555;
    public int add(int x, int y)
    {
        return x+y;
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        int a = 4;
        int b = 7;
        Calculator cal1 = new Calculator();
        int result =  cal1.add(a,b);
        System.out.println(result);
        Calculator cal2 = new Calculator();

        cal1.num = 1000;
        System.out.println(cal1.num);
        System.out.println(cal2.num);
    }
}

/*
 * In Java, heap memory is cleared automatically by the Java Virtual Machine (JVM) through 
 * a process called Garbage Collection (GC). The JVM's Garbage Collector is responsible for 
 * reclaiming memory that is no longer in use by the program, making it available for 
 * future allocations.
 */
