

public class Karthik {
    public static void main(String [] args)
    {
        //&& AND
        //|| OR
        //! NOT
        int a = 50;
        int b = 75;
        int c = 45;
        int d = 75;

        boolean result1 = (a < b) && (c<d);
        System.out.println(result1);

        boolean result2 =(c<d) || (b<a);
        System.out.println(result2);

        boolean result3 = (b < a) && (d > c);
        System.out.println(result3);
        
        boolean result4 =(c<d) || (b<a) || (c>a);
        System.out.println(result4);
        System.out.println("This is an example for NOT operator : "+!result4);


    }
    
}
