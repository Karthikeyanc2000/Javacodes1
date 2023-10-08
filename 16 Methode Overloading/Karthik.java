
class Calculator{
    public int add(int a, int b)
    {
        int result = a+b;
        return result;
    }
    public int add(int a, int b , int c)
    {
        int result2 =a+b+c;
        return result2;
    }

    public double add(double a, int b)
    {
        double result3 = a+b;
        return result3;
    }
}
public class Karthik {
    public static void main(String [] args)
    {

        int x = 15;
        int y = 15;
        int y1 = 2;
        double z = 45.65;
        Calculator cal = new Calculator();
        int value1 = cal.add(x,y);
        int value2 = cal.add(x,y,y1);
        double value3 = cal.add(z,x);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
    
}
