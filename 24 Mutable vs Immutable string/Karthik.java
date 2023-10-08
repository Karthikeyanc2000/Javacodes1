
//Generally Strings in java is Immutable because these string object is created inside heap
//and inside heap there is a section called String constant pool.
//Please reffer telusko channel for heap and String constant pool diagram explaination.

public class Karthik{
    public static void main(String [] args)
    {
        String name = "Navin";  //here this object is stored in one address
        name = name+ " Reddy";  // here new object is created (it is not updating previous string)
        System.out.println("Hello "+name); //hello Navin Reddy

        String s1 ="John";  // Here both s1 and s2 are havimg same address because of 
        String s2 = "John"; // String constant pool present inside heap memory

        System.out.println(s1 == s2 ); // here we proved by checking wether it having same address.
        //true.

        //mutable string - change
        //immutable String - unchange 
        //default String in java is immutable

        // String buffer and String builder both are similar one diference ,
        //both are similar both provide a way to create a mutable string.

    }
}