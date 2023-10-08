



//set supports unique values(no duplicate elements).
//Set extends collection but the class which implements Set is different that is Hashset.


//set will not have the repeated value in it.
//set will not give value in sorted order either it not give in the order we enter the value,
//because set does not have a index value.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class Karthik {
    public static void main(String [] args)
    {
        //in the place we using Set we can use Collection because anyway HashSet implements Set and set extends Collection.
        Set<Integer> num = new HashSet<Integer>();
        num.add(5);
        num.add(20);
        num.add(45);
        num.add(74);
        num.add(5);
    
    

    for(int obj :num)
    {
        System.out.println(obj);
    }
    System.out.println(num);
    System.out.println(num.size());

    //if we want to get our output in sorted order then we can use TreeSet.
     System.out.println("-----------------------------------");
     System.out.println("Below output is from TreeSet(sorted set value) :  ");
    Set<Integer> num2 = new TreeSet<Integer>();
        num2.add(5);
        num2.add(20);
        num2.add(45);
        num2.add(74);
        num2.add(5);

        for(int value : num2)
        {
            System.out.println(value);
        }

        System.out.println(num2.size());
        System.out.println(num2.remove(74));//trur
        System.out.println(num2.remove(44));//false
        System.out.println(num2.size());

        //we can use iterator for printing our values insted of using loops.
        Iterator<Integer> values2 = num2.iterator();
        while(values2.hasNext())
        {
            System.out.println("Value from iterator : "+values2.next());
        }

}
    
}

//If you want to maintain the order of insertion, you should use LinkedHashSet.
