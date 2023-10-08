
//Map is not an implementation or it does not extends collection interface but it is a part of collection concept (collection API).


//Map is a collection of key and value pair.
//Map is also not following the sequence similar to set (no order while printing output).
//key in unique(we cant have two key with same name or value) but value can same.
//so the key cannot be repeated but values can repeat.

//here we having a set and list combiantion so we called map.(because key is unique that is from set and value can be same that is fom list)

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
public class Karthik {
 public static void main(String [] args)
 { 
    Map<String,Integer> student = new HashMap<>(); 
    student.put("Navin",45 );
    student.put("John",24 );
    student.put("cena",41 );
    student.put("mark",45 );
    student.put("joy",45 );
    student.put("john",75 );
    //why we are adding put method to it means if we use add method we adding new element to it,
    //but put method means if the value is already present then we replacing it.(so we using put method).

    System.out.println(student.get("cena"));
    System.out.println(student.get("john"));
    System.out.println(student);

    System.out.println(student.keySet());

    for(String key : student.keySet())
    {
        System.out.println(key+ " : "+student.get(key));
    }

    //insted of using hashmap we can use hashtable also.
    //the main difference if hashtable is synchronized. but hash map is not synchronized,
    //if we are using hashmap in multithreading then we need to specify synchronized keyword externally.
    //but if we use hashtable it is synchronized so we can use in multithreading.(already synchronized).  
    Map<String,Integer> val = new Hashtable<String,Integer>();
    val.put("john cena 1",75);
    val.put("cena 1",75);
    val.put("cena",42);
    val.put("gopi",41);
    val.put("john cena",29);
    val.put("cena 1",78);

    System.out.println(val);
    for(String key1 : val.keySet())
    {
        System.out.println(key1+" "+val.get(key1));
    }

 }   
}


/*
 * 
 * TreeMap maintains order in a sorted manner based on the keys, not the values. 
 * In a TreeMap, elements are sorted according to the natural order of the keys 
 * (or using a specified Comparator if provided) rather than the values. This is true 
 * regardless of whether the keys or values are of type String or any other data type.
 * 
 */
