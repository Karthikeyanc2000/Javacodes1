

class A{
    int mark1;
    int total;

    public boolean equals(A that)
    {
        if(this.mark1 == that.mark1 && this.total == that.total)
        {
            return true;
        }
        else 
           return false;
    }
}
class B{

}
public class Karthik {
    public static void main(String [] args)
    {
        A a = new A();
        a.mark1 =97;
        a.total=500;

        A a2 = new A();
        a2.mark1=97;
        a2.total=500;

        //now we comparing object as it is same or not for that we must use equals and decrate it.
        //so we must use equals methode in class to compare object.
        boolean value = a == a2;  //here two different object.
        System.out.println(value); //output false because we not using equals methode in class.

        boolean value2 = a.equals(a2); //now output is : true  from our two object comparision.
        System.out.println(value2);

        String name1 = "John";
        String name2 ="John";
        //here it is two variable but in java we have string constant pool inside jvm,
        //due to that both string name1 and name2 are same so same address it occupies.
        boolean value3 = name1 == name2; //here it comparing the address 
        System.out.println(value3);   //true


        int a3 = 500;
        int b2 = 800;
        int c2 = 500;
        boolean v4 = a3==c2;
        boolean v5 = a3==b2;
        System.out.println(v4); //true 
        System.out.println(v5); //false




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
    }  
}
