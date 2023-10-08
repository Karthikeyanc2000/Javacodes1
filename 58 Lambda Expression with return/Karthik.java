

//Lambda expression work with only Functional interface.
@FunctionalInterface
interface A{
    int add(int x,int y);
}
public class Karthik {
    public static void main(String [] args)
    {
        A obj = (a,b) -> a+b;  //here it is return statement in lambda expresssion.
                               //if we have multiple line then we have to use curly brackets and we have to use return statement.
       int value1 = obj.add(5,4);
       System.out.println(value1);
    }
    
}
