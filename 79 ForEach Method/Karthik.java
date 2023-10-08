
import java.util.*;
import java.util.function.Consumer;

public class Karthik {
    public static void main(String [] args)
    {
        //there are different ways to fetch data

        List<Integer> num = Arrays.asList(5,78,45,56,77,12,23);

        System.out.println(num);
        
        int sum =0;
        for(int val : num)
        {
            if(val%5==0)
            {
                sum=sum+val;
            }
        }
        System.out.println(sum);

      //different methods for fetching values.
       //method 1
       System.out.println();
       System.out.println(num);

       //method 2
       System.out.println();
       for( int value : num)
       {
        System.out.println(value);
       }
        //method 3
        System.out.println();
       for(int i=0;i<num.size();i++)
       {
        System.out.println(num.get(i));
       }
       //method 4
       System.out.println();
       System.out.println("Below is the output from for each loop");
       num.forEach(n -> System.out.println(n));





       //now see how this forEach is working
       //it is woking based on lambda expression.
       //lets see.


       List<Integer> nums2 = Arrays.asList(42,45,48,58,56,12,23);
        
       //forEach method use object of a consumer 
       //consumer is an interface 
       //consumer is an functional interface.
       //consumer interface has one method that name is void accept()
       Consumer<Integer> con = new Consumer<Integer>() 
       {
        public void accept(Integer n)
        {
            //here we can doo our operation.
            System.out.println(n);
        }
       };

       System.out.println("-------------------------------");
       nums2.forEach(con);

       //now using lampda expression.
         Consumer<Integer> con2 = (Integer n) ->
        {
            //here we can doo our operation.
            System.out.println(n);
        };
        System.out.println("----------con2----------");
        nums2.forEach(con2);

        //At last the lambda expression is reduced to this
        Consumer<Integer> con3 = (Integer n)->System.out.println(n);
        System.out.println("----------con2----------");
        nums2.forEach(con3);

        //At finally this is reduced forEach to this 
        System.out.println();
        nums2.forEach(n -> System.out.println(n));

    }
    
}
