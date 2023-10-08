//by default all our java class extends object class for working of some methodes we needed.
/*
 * so tostring is a methode in object class we can modify that tostring to our own wish.
 * similarly we can modify the hashcode valuse by ourself.(we can use vs code option for this or
 * explecitly we can create own tostring and hashcode)
 * 
 * another importan is equals methode also we can customize to our own wish.(equals methode)
 */
 // mostly dont create or define equals and tostring by yours you can use your ide click source action.
 class Laptop{
    int price;
    String  model;
    int year;
     
    @Override
    public String toString(){  //here S caps for both toString and return String
        return price+" "+model+" "+year;
    }
    
    public boolean equals (Laptop that)
    {
        if(this.price == that.price && this.model.equals(that.model) && this.year == that.year)
        {
            return true;
        }
        
           return false;
    }
 }
public class Karthik {
    public static void main(String [] args)
    {
        Laptop lap = new Laptop();
        lap.model="ghij";
        lap.price=57000;
        lap.year=2021;

        System.out.println(lap);//without using tostring output:Laptop@5acf9800
        System.out.println(lap.toString()); //this line is also similar to above line but tostring is hidden defaultly. 
        //output:Laptop@5acf9800 //this is due to inbuild tostring and inside that inbuild hashcode.

        System.out.println(lap); //output after adding tostring :65000 154 2023
        System.out.println(lap.toString());//output:65000 154 2023

        Laptop l1 = new Laptop();
        l1.price=55000;
        l1.model="abc";
        l1.year=2020;

        Laptop l2 = new Laptop();
        l2.price=55000;
        l2.year=2020;
        l2.model="abc";

        boolean value = l1 ==  l2;

        System.out.println(value); //output : false    here it is showing false
        boolean value2 = l1.equals(l2); //output : false here also false so,
        //we have to create our own equals method that override the inbuild equals method from object class.
        System.out.println(value2);//before creating equals methode output: false

        System.out.println(value2);//after creating equals methode output : true
    }
}

/*
 * In Java, the equals() method is a method that is used to compare the
 * contents of two objects to determine if they are equal. By default, 
 * the equals() method in Java compares the memory references of objects,
 * which means it checks if two object references point to the same memory location. 
 * This is not always suitable for comparing the actual content of objects,
 * especially for custom classes that you create.
 */


 
      /*
         * You are comparing primitive int variables, not objects. In Java, when you 
         * compare primitive data types like int, boolean, char, etc., using the == operator, 
         * you are comparing their values. So, in this case:
         * 
         *  -->a3 == c2 compares the values of a3 (500) and c2 (500), and since they have the 
         *     same value, it evaluates to true.
         *  -->a3 == b2 compares the values of a3 (500) and b2 (800), and since they have 
         *     different values, it evaluates to false.
         * 
         * In this context, you are not dealing with objects, so you get the expected output 
         * based on the values of the variables.
         * 
         * However, when comparing objects using ==, you are comparing their references in 
         * memory, not their content. If you want to compare the content of objects, you  
         * should use the .equals() method or compare the relevant attributes of the objects.
         * 
         * 
         * 
         * 
         */
