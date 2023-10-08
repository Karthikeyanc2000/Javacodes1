

public class Karthik {
    public static void main(String [] args)
    {
        int num1 [] [] = new int [3] [4];

        int random =0;
         
        for(int i=0;i<=num1.length-1;i++)
        {
            for(int j=0;j<=num1[i].length-1;j++)
            {
                num1[i][j]=(int)(Math.random()* 10);
            }
        }

        for(int i=0;i<=num1.length-1;i++)
        {
            for(int j=0;j<=num1[i].length-1;j++)
            {
                System.out.print(num1[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------");
        System.out.println("below values are from enhanced for loop");

        for(int n1 [] : num1)
        {
            for(int m : n1)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}
