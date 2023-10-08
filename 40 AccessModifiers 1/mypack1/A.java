package mypack1;
public class A {
    private int marks = 100; //access only to the same class. 
    protected int cgpa =9;  // access to same pack and child class
    int age = 24; // default it is access to only same package.
    public int total = 490;//access to all class and all packages and all sub classes.

    public void show()
    {
        System.out.println(marks);
    }
    protected void show2()
    {
        System.out.println("this is show2 in a");
    }
 
}
