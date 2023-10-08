/*
 * functional interface
 */

 @FunctionalInterface
 interface Myclass{
    int add(int a,int b);//it is by default public abstract.
 }
public class Karthik {
    public static void main(String [] args)
    {
        //now we using lambda expression only for functonalinterface not anonymous inner class.

        Myclass clas1 = (i,j) -> i+j;
        Myclass clas2 =(k,j)->k+j;

        Myclass clas3 = new Myclass() {
            public int add(int m,int n)
            {
                return (m+n)*2;
            }
        };

        System.out.println(clas1.add(45, 75));
        System.out.println(clas2.add(7, 012));
        System.out.println(clas3.add(74, 2));

        
    }
    
}
