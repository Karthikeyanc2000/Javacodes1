//Every time you create a instance variable make it private. imp
//instance variable means the variable inside class (stored in heap).
//variable inside a class's methode becomes local variable (stored in stack).

//encapsulation some how we encapsulate variables using methodes.

// Encapsulation -  
//   Data Hiding:  Encapsulation allows you to hide the internal state (data) of an object 
//   from the outside world. By marking variables as private, you prevent direct access to 
//   the internal data from outside the class. This prevents external code from accidentally 
//   or maliciously modifying the object's state in unexpected ways.


//Advantage of encapsulation 
//  Data Integrity: Encapsulation allows you to maintain the integrity of the data within an 
//  object by controlling how it is accessed and modified. By marking instance variables as 
//  private and providing public methods (getters and setters) to interact with them, you can
//  enforce rules, validation, and constraints on the data. This ensures that the data remains
//  in a consistent and valid state.
class Human{
    private String name;
    private int age;

    public int getAge()
    {
        return age;
    }
    public void setAge (int a)
    {
        this.age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String str)
    {
        this.name = str;
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        Human hum = new Human();
        hum.setName("ram");
        hum.setAge(18);
        System.out.println(hum.getName()+" : "+hum.getAge());

        Human hum1 = new Human();
        hum1.setName("John");
        hum1.setAge(23);
        System.out.println(hum1.getName()+" : "+hum1.getAge());
    }
    
}

//if we using constructors then there is no need for setting the values but if we want 
//to get the values we need to use get method.
