import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    int marks;
    String name;

    public Students(int marks,String name)
    {
        this.name= name;
        this.marks = marks;
    }
    public String toString()
    {
        return "name : ["+name+"] marks : ["+marks+"]";
    }
}

class Karthik{
    public static void main(String [] args)
    {

        List<Students> stud = new ArrayList<Students>();
        stud.add(new Students(55,"John"));
        stud.add(new Students(72,"Cena"));
        stud.add(new Students(85,"Sidharth"));
        stud.add(new Students(90,"yogi babu"));
        stud.add(new Students (92,"SANTHANAM"));

        for(Students value : stud) //here it is Student object so we should use Students referrence variable not String in enhanced for loop.
        {
            System.out.println(value);
        }
        //comparator is functional interface so we using lambda expression. 
        Comparator <Students> com2 = (Students i, Students j) -> i.marks > j.marks?1:-1; //if we put return statement we can write this in below line using curly braces but if we not using return keyword then we should type in single line.
     //   {     
            //    if(i.marks > j.marks)
            //    {
            //        return 1;
            //    }
            //    else
            //    return -1;   
      //  };

        Collections.sort(stud, com2);
        System.out.println();
        for(Students value2 : stud)
        {
            System.out.println(value2);
        }

    }
}

/*
 * what is comparator?
 *   if we wnat to specify what logic we want to sort then we can use comparator.
 * 
 * what is comparable?
 *    if we want to give the power to our class itself to compare its own objects and sort then we can use comparable. 
 * 
 */