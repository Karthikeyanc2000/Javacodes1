

class a{
    public a()
    {
        System.out.println("in a ");
    }
    public void show()
    {
        System.out.println("in show methode of a class.");
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        a obj = new a();
    //here obj is not object it is a reference variable to the object.
    //when we using new keyword it create an object inside heap and then obj points to that object.
    //so now the obj is pointing to the object that created inside heap memory.
    //here new a() is the object creation.
    //everytime we create a object it will call the constructor defaultly.



    a obj2 = new a(); //here it is a two step not a sinle line.
    int marks;  //similar to normal variable declaration 
    marks = 50;

    a obj3;
    obj3 = new a(); // so we understand that it is of two steps.

    new a(); //anonymouse object
    // here this object is created inside the heap memory.
    //the problem is it is anonymouse because there is no reference to this so,
    // we cant reuse it.

    new a().show();
    new a().show();



    }
    
}
