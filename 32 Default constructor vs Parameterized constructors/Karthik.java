
class Human{
    private int age;
    private String name;
    
    public Human()
    {

    }
    public Human(String name)
    {
        this.name= name;
    }
    public Human(int age, String name)
    {
        this.age=age;
        this.name=name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        Human h1 = new Human(24 ,"John");
        Human h2=new Human("cena");
        System.out.println(h1.getAge()+" : "+h1.getName());
        System.out.println(h2.getAge()+" : "+h2.getName());
    }
    
}
