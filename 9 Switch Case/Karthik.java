
public class Karthik {
    public static void main(String [] args)
    {
        int numb = 7;
        switch(numb)  // small s
        {
        case 1:    // space between case and 1 
            System.out.println("Monday");
            break; 
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednessday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default : // d in small
            System.out.println("Please enter a valid number");
            break;
        }
              //switch case using String example.
                String day = "Monday";
        
                switch (day) {
                    case "Monday":
                        System.out.println("It's Monday!");
                        break;
                    case "Tuesday":
                        System.out.println("It's Tuesday!");
                        break;
                    case "Wednesday":
                        System.out.println("It's Wednesday!");
                        break;
                    case "Thursday":
                        System.out.println("It's Thursday!");
                        break;
                    case "Friday":
                        System.out.println("It's Friday!");
                        break;
                    default:
                        System.out.println("It's the weekend!");
                        break;
                }
        }
    }
    
