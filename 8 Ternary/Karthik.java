
public class Karthik {
    public static void main(String [] args)
    {
        int n = 7;
        int result1= 0;
        if (n%2==0)
        {
            result1=10;
        }
        else{
            result1 = 20;
        }
        System.out.println(result1);

     // by using ternary
     int m=11;

     int result2 = (m%2==0) ? 10 : 20 ;
     System.out.println(result2);


     int a = 50;
     int b= 100;
     int c=66;
     int result3 =(a<b && b<c) ? 15 : (b>a && c<b) ? 20 :25;
     System.out.println(result3); 

    }
    
}
