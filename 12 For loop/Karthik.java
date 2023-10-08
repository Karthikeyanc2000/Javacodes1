
public class Karthik {
    public static void main(String [] args)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("DAY "+ i);
        }
        System.out.println("--------------------------");



        for(int j =1 ;j<=7 ;j++)
        {
            System.out.println("DAY "+j);
            
            for(int k =1;k<=8;k++)
            {
                System.out.println((k+8)+" - "+(k+9));
            }
            
        }
        System.out.println("------------------------");

        int m = 1;
        for(;m<=7;)
        {
            System.out.println("DAY "+m);
            m++;
        }
    }
    
}
