



//we have two choice we can use comparator or we can use comparable.
//if we use cmparable then our class should implements comparable interface and then we have to use compare to method inside the class.(by this we can use normal sort)
//if we use comparator then we can create a class which implemets Comparator or we can use inner anonymous class then we should use the method compare inside that class.(but here when sorting we should pass the reference of our comparator variable also).
//even if we use comparable we can override the logic by using comparator .


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

// this is an example for comparable
class Player implements Comparable<Player>{
    String name;
    int score;

    public Player(String name,int score)
    {
        this.score = score;
        this.name=name;
    }

    public String toString()
    {
        return "name : "+name+" and "+"score : "+score;
    }

    public int compareTo(Player that) {
          
        if(this.score > that.score)
        {
            return 1;
        }
        else
        return -1;
        
     //   throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
public class Karthik {
    public static void main(String [] args)
    {
        List<Students> stud = new ArrayList<Students>();
        stud.add(new Students(55,"John"));
        stud.add(new Students(72,"Cena"));
        stud.add(new Students(85,"Sidharth"));
        stud.add(new Students(90,"yogi babu"));
        stud.add(new Students (92,"SANTHANAM"));

                /*
                  List<Students> check = new List<Students>
                 {
                     new Students(55, "Karunas"),
                     new Students(75, "Papu")
                 };
                     this feature is available only in c# not in java.
             */

        System.out.println(stud);

        for(Students value : stud) //here it is Student object so we should use Students not String in foreach loop.
        {
            System.out.println(value);
        }

        Comparator <Students> com2 = new Comparator<Students>() //Comparator was an functional interface so we using anonymous inner class here.
        {                                                       //comparator we can use directly Lambda expression also // better is directly using Lambda expression for comparator interface.
            public int compare(Students i, Students j)
            {
                if(i.marks > j.marks)
                {
                    return 1;
                }
                else
                return -1;
            }
        };

        Collections.sort(stud, com2);
        //here why we should pass com2 but not when we sort Integers because if we see Integer class,
        //it implements a interface called comparable but our Students class not implementing here.
        //so Integer class implements a interface call comparable default so it works with normal sort.

        
        List<Player> play = new ArrayList<Player>();
        play.add(new Player("John",542));
        play.add(new Player("papu",423));
        play.add(new Player("abc ",23));
        play.add(new Player("power rangers",438));
        play.add(new Player("Ben 10",756));

        System.out.println("----------------------------------------");
        System.out.println("Below is the output from comparable");

        for(Player p : play)
        {
            System.out.println(p);
        }

        Collections.sort(play);
        System.out.println();


        for(Player pp : play)
        {
            System.out.println(pp);
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

//comparator is a functional interface so better we can use anonymous inner class or lambda expression.
 //comparable interface is not functional interface. so we should implement it in our required class.

