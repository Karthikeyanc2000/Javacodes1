

//multiple inheritance brings ambiguity(confusion).

class a{
    public void show(){
        System.out.println("in class a");
    }
}
class b{
    public void show(){
        System.out.println("in class b");
    }
}
/*   class c extends b,c{
     public void show()
        {
          System.out.println("in class c");
        }  
}  */  //so here the confusion comming which methode to be called, so java removed this feature.
//but indirectly java supports multiple inheritance using interface. 

public class Karthik{
    public static void main(String [] args)
    {

    }
}