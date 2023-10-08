
public class Karthik {
    public static void main(String [] args)
    {
        int num1 [] [] = new int [3] []; // jagged

        num1 [0] = new int [4];
        num1 [2] =new int [3];
        num1 [1] = new int [4];


        for(int i=0;i<num1.length;i++)
        {
            for(int j=0 ;j<num1[i].length;j++)
            {
                num1[i] [j] = (int) (Math.random()* 10);
            }
        }

        for(int obj [] : num1)
        {
            for(int m : obj)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // 3D Array
        int num2 [] [] [] = new int [3] [4] [2];
        //similar to 2D Array we can doo 3D Array. 
        //Please reffer telusko youtube channel for 3D array diagram that is very easy.
    }
    
}
