//in java every thing is class but the same is differnt in c++.

enum Status{
    Running,Failed,Pending,Sucess;  //these are names of constants.

}
public class Karthik {
    public static void main(String [] args)
    {
        Status s = Status.Running;
        System.out.println(s);

        Status ss [] = Status.values();

        for(Status sss : ss)
        {
              System.out.println(sss+" : "+sss.ordinal());
        }
    }
    
}
