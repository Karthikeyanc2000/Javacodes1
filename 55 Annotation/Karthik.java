//Annotation is usefull when we working on frame works. there are different frame works.

class A{
    public void showMeTheBestMovieRuuningToday(){
        System.out.println("in class A");
    }
}
class B extends A  {
    @Override
    public void showMeTheBestMovieRuuningToday(){
        System.out.println("in class B");
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        B b1 = new B();
        b1.showMeTheBestMovieRuuningToday();
    }
    
}
