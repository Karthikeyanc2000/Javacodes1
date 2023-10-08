

import java.util.*;

public class Karthik {
    public static void main(String [] args)
    {
      
        List<Integer> val = new ArrayList<Integer>();
        val.add(15);
        val.add(72);
        val.add(99);
        val.add(71);

        System.out.println(val);
        Collections.sort(val);//here we sorting normally but if we wnat to sort in our own wish(like sorting based on second number like that means we should use comparator).
        //so comparator is used here to sort our values based on on our own wish.
        System.out.println(val);






        //here comparator is a functional interface so we can use using anonymous inner class or we can create a class and implement Comparator interface.
        //in Comparator we have a method called compare 
        Comparator<Integer> com = new Comparator<Integer>() 
        {
           public  int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                {
                    return 1;
                }
                else 
                return -1;
            }   
        };

        System.out.println("Below is the sorting based on Comparator : ");
        Collections.sort(val,com);
        System.out.println(val);
         System.out.println("---------------------------------------");

        //now we sorting string(based on length) using comparator.
        List<String> names = new ArrayList<String>();
        names.add("Karthik");
        names.add("John");
        names.add("cena");
        names.add("John");
        names.add("John cena ");
        names.add("Siddharth");

        System.out.println(names);

        Comparator<String> com2 = new Comparator<String>()  //insted of this we can create new class and then we can implement Comparator and then we can define the compare method inside.
        {                                                    //then we can pass that class object to sort method. //but is is lengthy code.(we have to create new class and method)
            public int compare(String i, String j)          
            {
                if(i.length()>j.length())
                {
                    return 1;
                }
                else
                return -1;
            }  
        };

        Collections.sort(names,com2);
        System.out.println(names);
    }
    
}
