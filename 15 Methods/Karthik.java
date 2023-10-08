

class Computer
{
    public void playmusic()
    {
        System.out.println("Music is Playing....");
    }

    public String getmepen(int x)  // String S should be capital
    {
        if(x>=10)
        {
            return "Here is your pen";
        }
        else{  // here if we not using else also no problem directly we can put return "Nothing".
            return "Nothing";
        }

    }
}
public class Karthik {
    public static void main(String [] args)
    {
        int cost = 3;
        Computer obj = new Computer();
        obj.playmusic();
        String str = obj.getmepen(cost);
        System.out.println(str);


    }
    
}
