




//if we are working with collection and if we not put type in it means it will give runtime error 
//so we have to handle it, better mention the type of collection what we using is good.
//ex.collection<Integer> num = new ArrayList<Integer>(); 
//it will give compile time error if we enter wrong data type.
//if we not mentioning the type in collection (Collection num = new ArrayList();) then all the value will be considered as a object so if some value data type is wrong then it will give runtime error.
//ex. num.add(5); num.add(7); num.add("8"); here error comes in runtime if we not specifying data types in collection.




//int is primitive Integer is a wrapper of int(in collection we should use class only).

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Karthik {
    public static void main(String [] args)
    {                                      //here if we not mentioning Integer also no problem but if we use interface here then we should specify its type ex.Integer or String.
        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(5);
        num.add(15);
        num.add(75);
        num.add(41);
        num.add(23);

        System.out.println(num.size());
        System.out.println(num.indexOf(41));
        System.out.println(num.get(2));
        System.out.println("--------------------------------");

        for(int a : num)
        {
            System.out.println(a);
        }
        System.out.println(num);
    }
    
}



/*
 * Specifying the type of collection during declaration, like 
 * `Collection<Integer> num = new ArrayList<Integer>();`, ensures compile-time type safety, 
 * preventing runtime errors caused by incorrect data types when adding elements to the 
 * collection.
 * 
 */


/*
 * 
 *      example for loosely bounded.
 *      
 *      //list is interface                 //ArrayList is a class that implemented List
 *      List<String> looselyBoundedList = new ArrayList<>();
 *   
 * 
 * 
 * 
 *     Tightly bounded.
 *     
 *     //ArrayList is class                      //ArrayList is class
 *     ArrayList<String> tightlyBoundedList = new ArrayList<>();
 * 
 * 
 * 
 */


 
  /*
   * 
   * List<String> looselyBoundedList = new ArrayList<>(); is an example of loosely 
   * bounded generic type because you've declared it as a List<String>, which is an interface, 
   * while using ArrayList as the concrete implementation. This allows flexibility in changing 
   * the underlying implementation without affecting the rest of the code.
   * 
   * 
   * 
   * 
   * 
   * ArrayList<String> tightlyBoundedList = new ArrayList<>(); is an example of tightly
   * bounded generic type because you've specifically chosen ArrayList<String> as the type 
   * for the variable, and it's tightly bound to the ArrayList class that can only hold String 
   * elements.
   * 
   * 
   * 
   * 
   */
