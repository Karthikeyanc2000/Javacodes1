//Here lambda expression is similar to inner anonymous class syntax.

//Lambda expression works with only functional expression.

@FunctionalInterface
interface A{
    void show();
}

public class Karthik {
    public static void main(String [] args)
    {
        A obj = () -> { 
            System.out.println("in show of interface A ");
              };

        obj.show();;
    }
}
