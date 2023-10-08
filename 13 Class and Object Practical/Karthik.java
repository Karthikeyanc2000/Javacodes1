//please see telusko channel video 2.51.48 for better understanding of inner concepts.


class calc
{
    public int add()
    {
        System.out.println("this calc class add methode");
        return 95;
    }
}

class calculator1{
    public int addition(int x, int y)
    {
        int value1 = x + y;
        return value1;

    }
}
public class Karthik {
    public static void main(String [] args)
    {
        int a= 100;
        int b =500;
        calc c = new calc();
        int result = c.add();
        System.out.println(result);
        calculator1 kar = new calculator1();
         int result2 = kar.addition(a,b);
         System.out.println(result2);
    }
    
}
