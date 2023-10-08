package mypack1;
public class B extends A{
    A a = new A();
    //here same pack so except private all the variable from A class should be abe to use here.
   public void show2()
   {
     //System.out.println(a.marks); //we cant use because it is private.
    System.out.println(a.age+" "+a.cgpa+" "+a.total);
   } 
    
}
