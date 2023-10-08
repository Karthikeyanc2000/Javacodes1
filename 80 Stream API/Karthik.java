


// we can use Stream only once 
//we use the same Stream again then it will give exception (runtime error).
//use of Stream -- is it has many methods and we can have the origianl value safely especially while running multi threads. (so it not allow mutation because original values are safe)
//what ever changes we do in Stream that will not affect original value (we can alter the value, we can double the value etc...)

import java.util.stream.Stream;
import java.util.*;

public class Karthik {
    public static void main(String [] args)
    {
        List <Integer> num = Arrays.asList(45,15,85,44,63,45);
        Stream<Integer> s1 = num.stream();
        s1.forEach(n -> System.out.println(n));
       // s1.forEach(n -> System.out.println(n)); //here it will give runtime error because we can use stream only one time. 

       //normal use of for loop for our logic is.
       int sum =0;
       for(int value : num)
       {
        if(value%2 ==0)
        {
           value =value*2;
           sum=sum+value;
        } 
       }
       System.out.println();
       System.out.println(sum);

       // we can apply filters to our Streams so insted of using for loop for modifying our logic we can use filters in Stream.

       List<Integer> num2 = Arrays.asList(45,15,85,44,63,45);
       Stream<Integer> ss1 = num2.stream(); //here num2.stream small s here. otherwise error
       Stream<Integer> ss2 =ss1.filter(n -> n%2==0);
       Stream<Integer> ss3 = ss2.map(n -> n*2);
       int result = ss3.reduce(0, (a,b)->a+b); //here we using int result because it returns a single integer as reduced here.
       System.out.println(result);


       //now we use some reduced form of using the filter in Stream.

       int result2 = num2.stream() //here small s for stream
            .filter(n ->n%2==0)
            .map(n-> n*2)
            .reduce(0,(d,t) ->d+t); //here 0 should be mentioned otherswise error.
            System.out.println(result2);
    } 
}
