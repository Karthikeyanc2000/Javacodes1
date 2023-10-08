
class Calc{
    public int add(int x, int y)
    {
        return x+y;
    }
    public void show()
    {
        System.out.println("in Calc class");
    }
}
class AdvCalc extends Calc{
   // public static int add(int x,int y)     
   //Error 
   //a static methode cannot hide instance methode from Calc.
   @Override //this is annotation, this avoide some careless errors in overriding.
   public int add(int x, int y) // if we using static methode it is error (it not able to hide calc methode as it is static).
    {
        return x+y+1;
    }
    @Override
    public void show()
    {
        System.out.println("in AdvCalc class");
    }
}

class VeryAdvCalc extends AdvCalc{
   @Override 
   public int add(int x, int y) 
    {
        return x+y+100;
    }
    @Override
    public void show()
    {
        super.show(); // this calls the parent class method.
        System.out.println("in VeryAdvCalc class");
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        AdvCalc adv = new AdvCalc();
       int value1= adv.add(15,1);
       System.out.println(value1);
        adv.show();
        VeryAdvCalc vad = new VeryAdvCalc();
        vad.show();
    }
}
//so here child class overrides the parent class method 
//we can over come this by using super keyword.

/*
 * 
 * If you want to access the parent class's method directly, you need to use super.display() 
 * or create a reference to the parent class and call the method through that reference.
 * 
 * 
 */
