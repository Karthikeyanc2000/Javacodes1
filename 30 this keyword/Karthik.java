//Must watch telusko channel video (this keyword),

class Human{
    private String name ;
    private int age;
    private int height;
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
      //  age = age; // here warning and output will be 0
      //because local variable also age and instance variable also age so,
      //preference given for local variable age (So it is self asigning age = age local variable)
      //so ne need to assign it to instance variable age.
    
        /* //methode 1
         Human h = new Human();
         h.age=age;      // here also output 0
        // because it is goint to create new object, so new addres and new object because o/p:0
        */

        //failure

        //so
        this.age = age;
    }     
    public int getHeight()
    {
        return height;
    }
    //methode 2 trying alternative for this keyword
    public void setHeight(int height , Human hu)
    {
        Human obj1 = hu;
        obj1.height=height; // this will work but it is complex
    }

    public String getName()
    {
        return name;
    }

    //methode 3  sucessful (reason behind we using this keyword).
    public void setName(String name)
    {
        this.name=name; //this is refers to instance of the class
        // this means current object.
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        Human human = new Human();
        human.setAge(24);
        human.setHeight(175, human);
        human.setName("John");

        Human human2 = new Human();
        human2.setAge(25);
        human2.setHeight(180, human2);
        human2.setName("John cena");

        System.out.println(human.getAge()+" : "+human.getHeight()+" : "+human.getName());
        System.out.println(human2.getAge()+" : "+human2.getHeight()+" : "+human2.getName());
    }
}
    
