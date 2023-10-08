



enum Status{
    Running,Pending,Success,Failed;
}
public class Karthik {
    public static void main(String [] args)
    {
        Status s1 = Status.Success;

        if(s1 == Status.Running)
        {
            System.out.println("All Good");
        }
        else if(s1 == Status.Failed)
        {
            System.out.println("Try again");
        }
        else if(s1 == Status.Pending)
        {
            System.out.println("Please wait..");
        }
        else
        {
            System.out.println("Done");
        }

        switch(s1)
        {
            case Running:
            System.out.println("All done");
            break;
            case Failed:
            System.out.println("Try again");
            break;
            case Pending:
            System.out.println("Please wait..");
            break;
            default:
            System.out.println("Done");
            break;
        }
    }
    
}
