import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.Arrays;
class Karthik{
    public static void main(String [] args)
    {
        List<Integer> num = Arrays.asList(5,75,25,44,23,36);

        //before we use stream API as

        Stream<Integer> s1 = num.stream();  // here s small
        Stream<Integer> s2 = s1.filter(n-> n%2 ==0);
        Stream<Integer> s3 = s2.map(m -> m*2);
        int ans = s3.reduce(0, (q,v) -> q+v);

        System.out.println("Output from old way of Stream api : "+ans);

        //now we use Stream API

        int result = num.stream()
            .filter(n -> n%2 ==0)
            .map(n -> n*2)
            .reduce (0,(a,e) -> a+e);

        System.out.println("Output from new way of Stream api : "+result);




        // now we see how this Stream api is working in detail

        //first filter
        //filter needs an object of predicate
        Predicate<Integer> p = new Predicate<Integer>() {  //it is a functional interface so we can use lambdaExpression.
            public boolean test(Integer n)
            {
                if( n%2 ==0)
                {
                    return true;
                }
                else
                   return false;
            }
        };

        //working of map
        //map needs an object of a function
        Function<Integer, Integer> FUN = new Function<Integer,Integer>() {
            public Integer apply(Integer n)
            {
                n=n*2;
                return n;
            }
        };



        int testing = num.stream()
            .filter(p)
            .map(FUN)
            .reduce (0,(c,e) -> c+e);

        System.out.println(testing);

        //we can also sort our stream
        
        Stream<Integer> sortedvalues =num.stream()
           .filter(n -> n%2 ==0)
           .sorted();

        System.out.println("This is the output of sorted Stream : ");
       // System.out.println(sortedvalues); // here error we cant do like this because it is returning many values   (not think like collection where we can print all values in one variable)

        sortedvalues.forEach(n -> System.out.println(n));


        //we can use parallel Stream also

            int testing2 = num.parallelStream() //here it will use multi threading.
            .filter(p)
            .map(FUN)
            .reduce (0,(c,e) -> c+e);
            //dont use parallel stream when we want to sort  // sorting needs all elements together.
            //we can use parallelStream while we are using filter no problem.

    }
}