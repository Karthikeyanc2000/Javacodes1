
//A constructor doesnot return anything.
// constructor used to assign a values when the object is created.
//every time you create a object it will call constructor.

class Human{
    private int age;
    private String name;

    public Human()
    {
        //this is default constructor 
        //if we change inbuild constructor then we must create a default constructor,
        //otherwise it will show error.
        System.out.println("in constructor");
    }

    public Human(int age, String name)
    {
        this.name = name;
        this.age= age;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

}
public class Karthik {
    public static void main(String [] args)
    {

        Human h1 = new Human();
        Human h7 = new Human();
        System.out.println(h1.getAge()+" : "+h1.getName());
        h1.setAge(24);
        h1.setName("John cena");
        System.out.println(h1.getAge()+" : "+h1.getName());

        Human h2 = new Human(15,"john");
        System.out.println(h2.getAge()+" "+h2.getName());
    }
    
}
// we can assign a values directly to variables but we use constructors because we following,
// we should follow the methods (we cant directly assign).
//we have to follow some standards.

//realtime advanced example for constructor.
//when we want to connect our application to database then that time inside constructor,
//we write our connection (writing connection inside constructor).