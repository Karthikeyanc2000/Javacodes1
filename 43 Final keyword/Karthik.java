//final keyword - variables , methods, class
//final keyword in variable means that is constant we can't change that variable value.
//final keyword in methode means we can't override that methode.
//final keyword in class means we can't inherit that class (we can't extend that class).

class Calc{
    public void show()
    {
        System.out.println("in Calc show");
    }
    final public void config()
    {
        System.out.println("in Calc config");
    }
}

class AdvCalc extends Calc{
    public void config() //here error because we can't override a final method.
    {
        System.out.println("in AdvCalc config");
    }
}

final class VeryAdvCalc {

}

   class SciCalc extends VeryAdvCalc {
    //here we can't inherite a final class

   }


public class Karthik {
    public static void main(String [] args)
    {
       final double PI =3.14;
      // PI = 55; //here error because we can't change value of final variables.(it is constant keyword in c++)
    }
    
}
