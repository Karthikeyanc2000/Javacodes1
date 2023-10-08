/*Super keyword
 *      3 use cases of super keywprd in java
 * 1.To access the data members of parent class when both parent and child class have member with same name.(variables)
 * 2.To access the methode of parent class when child class has overriden that methode,
 * 3.To explicitly call the no-arg and parameterized constructor of parent class.
 * 
 */

 class Bills{
    int amount = 50000;
    public void show()
    {
        System.out.println("The amount in Bills is "+amount);
    }
 }
 class Gpay extends Bills{
    int amount = 100000;
    public void show()
    {  
        super.show();
        System.out.println("The amount in Gpay is "+amount);
        System.out.println("The amount in Bills is "+super.amount);
    }
 }
public class Karthik {
    public static void main(String [] args)
    {
        Gpay g = new Gpay();
        g.show();
        System.out.println(g.amount);
    }   
}





// similarly we can use super methode in constructors for calling parent class,but
//but in constructor that super methode is default so we can add parameters to specify callling,
//or we can use this() methode to call the constructor of that same class default constructor.
